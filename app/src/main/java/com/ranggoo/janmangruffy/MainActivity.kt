package com.ranggoo.janmangruffy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ranggoo.janmangruffy.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private val integerList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView(binding) // init 초기화, view 화면에서 발생할 수 있는 이벤트.

    }

    private fun initView(binding: ActivityMainBinding) {
        // with, let, run, also, apply
        // 코틀린 스코프 펑션

    }


}




