package com.ranggoo.janmangruffy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ranggoo.janmangruffy.databinding.ActivityRf9Binding

class Rf9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityRf9Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.square3.setOnClickListener {

        }
    }
}