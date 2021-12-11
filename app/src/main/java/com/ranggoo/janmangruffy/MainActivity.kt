package com.ranggoo.janmangruffy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ranggoo.janmangruffy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel = MainViewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    // 뷰와 관련된 이벤트들을 초기화 함.
    private fun initView() {

        binding.rvRuffy.layoutManager = LinearLayoutManager(this@MainActivity)

        binding.btnLoad.setOnClickListener {
            // #1 뷰모델로 루피목록 요청해서 받음.
            val ruffies = viewModel.getRuffies(context = this@MainActivity);
            // #2 루피목로을 어댑터에 셋팅 함.
            val adapter = RuffyAdapter(ruffies)

            adapter.addClickEventListener(object : ItemRuffyEvent {
                override fun onClick(position: Int) {
                    Toast.makeText(this@MainActivity, "$position 번째 루피입니다.", Toast.LENGTH_SHORT).show()
                }

                override fun onLongClick(position: Int) {
                    Toast.makeText(this@MainActivity, "롱클릭 $position 번째 루피입니다.", Toast.LENGTH_SHORT).show()
                }
            })

            // #3 어댑터를 리싸이클러뷰에 달아줌.
            binding.rvRuffy.adapter = adapter
        }
    }

}



