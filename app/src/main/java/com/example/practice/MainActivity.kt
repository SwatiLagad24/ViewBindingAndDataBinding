package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
         binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imgSelect=binding.imgset.setImageResource(R.drawable.ic_launcher_foreground)
        binding.btnSave.setOnClickListener{

        }



        binding.btnSave.setOnClickListener{
           var user=User(
               binding.edtUsername.text.toString(),
               binding.edtBirthYear.text.toString().toInt(),
               R.drawable.ic_baseline_image_search_24

           )
            var intent=Intent(this,userDetails::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}