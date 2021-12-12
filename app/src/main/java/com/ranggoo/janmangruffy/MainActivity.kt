package com.ranggoo.janmangruffy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import com.ranggoo.janmangruffy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * 느낌표두개를 써야될 경우.
     * 반드시 선언이 되어있어야되거나, 문제가 없어야되는 코드에 써야된다.
     * 왜냐하면 이부분이 문제가 생기면 앱자체가 동작이 안될테니까, 강제로 앱애 크래시를 발생하게 해줘야 한다.
     */
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding by lazy { _binding!! }

    private var mainViewModel: MainViewModel = MainViewModel()
    private var ruffyAdapter = RuffyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      화면을 보여주는 코드
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        val ruffies = mainViewModel.getRuffies(this@MainActivity)
        ruffyAdapter.submitList(ruffies)

        Handler().postDelayed({
            val newRuffies = ruffies.toMutableList()
            newRuffies.removeAt(1)
            ruffyAdapter.submitList(newRuffies)
        },2000)
    }

    private fun initView() = with(binding) {
        rvRuffy.run {
            adapter = ruffyAdapter
            layoutManager = LinearLayoutManager(context) // this@MainActivity == context 동일함.
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // 앱이 화면에서 삭제될 때 실행되는 메소드.
        // 앱이 화면에서 사라진다고 해서, 니가 사용했던 변수나 클래스가 다 없어지는게 아니야.
        // null을 넣어줘야, 메모리에서 삭제가 된다.
        // 자바버추어머신(JVM)이 null로 지정된 것들을 쓰레기 값으로 취급을 해서 다 수집해서 없앤다.
        _binding = null
    }

}



