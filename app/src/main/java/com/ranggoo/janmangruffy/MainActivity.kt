package com.ranggoo.janmangruffy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.ranggoo.janmangruffy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        화면을 보여주는 코드
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        버튼 클릭 시 동작하는 부분

        binding.rfImage1.setOnClickListener {
// 메세지 뜨게 함
            Toast.makeText(this, "멍멍루피", Toast.LENGTH_SHORT).show()

//           화면이 클릭되면 확대 되도록
            val intent = Intent(this, Rf1Activity::class.java)
            startActivity(intent)

        }

//이미지 이름 붙이고 각각 클릭 시 다른 액티비티 이동

        binding.rfImage2.setOnClickListener {

            Toast.makeText(this, "초롱루피", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Rf2Activity::class.java)
            startActivity(intent)
        }

        binding.rfImage3.setOnClickListener {

            Toast.makeText(this, "해삐루피", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Rf3Activity::class.java)
            startActivity(intent)

        }

        binding.rfImage4.setOnClickListener {

            Toast.makeText(this, "뻘쭘루피", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Rf4Activity::class.java)
            startActivity(intent)
        }


        binding.rfImage5.setOnClickListener {

            Toast.makeText(this, "짜증루피", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Rf5Activity::class.java)
            startActivity(intent)


        }

        binding.rfImage6.setOnClickListener {


            Toast.makeText(this, "몰래루피", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Rf6Activity::class.java)
            startActivity(intent)

        }

        binding.rfImage7.setOnClickListener {

            Toast.makeText(this, "쭈굴루피", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Rf7Activity::class.java)
            startActivity(intent)

        }


        binding.rfImage8.setOnClickListener {

            Toast.makeText(this, "꺼이루피", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Rf8Activity::class.java)
            startActivity(intent)
        }

        binding.rfImage9.setOnClickListener {

            Toast.makeText(this, "너지스님 부르는 랑구", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Rf9Activity::class.java)
            startActivity(intent)


        }


    }


}


