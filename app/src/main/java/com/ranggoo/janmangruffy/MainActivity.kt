package com.ranggoo.janmangruffy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ranggoo.janmangruffy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel = MainViewModel()
    private lateinit var binding: ActivityMainBinding
    private var ruffyAdapter = RuffyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    // 뷰와 관련된 이벤트들을 초기화 함.
    private fun initView() {

        binding.rvRuffy.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvRuffy.adapter = ruffyAdapter

        binding.btnLoad.setOnClickListener {
            // #1 뷰모델로 루피목록 요청해서 받음.
            val ruffies = viewModel.getRuffies(context = this@MainActivity);
            // #2 루피목로을 어댑터에 셋팅 함.
            ruffyAdapter.submitList(ruffies)

        }

        ruffyAdapter.addClickEventListener(object : ItemRuffyEvent {
            override fun onDelete(ruffy: ItemRuffy) {
                // 현재리스트를 가져왔음.
                val newList = ruffyAdapter.currentList.toMutableList()
                // 대상을 삭제.
                newList.remove(ruffy)
                // 어댑터에 갱신해준다.
                ruffyAdapter.submitList(newList)
            }
        })

    }

}



