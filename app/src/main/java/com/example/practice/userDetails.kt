package com.example.practice

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.databinding.UserDetailsBinding

class userDetails:AppCompatActivity() {

    private lateinit var binding: UserDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=UserDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindinToData()
    }

    private fun bindinToData() {
        var user=intent.getSerializableExtra("user")as User
        binding.userObject=user

    }
}