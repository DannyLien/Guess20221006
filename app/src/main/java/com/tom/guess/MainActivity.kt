package com.tom.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tom.guess.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        //view-binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}