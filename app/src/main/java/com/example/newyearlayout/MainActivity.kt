package com.example.newyearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.newyearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var winter : WinterLayout

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun start(view: View) {
        binding.winter.startWinter()
    }
    fun stop(view: View) {
        binding.winter.stopWinter()
    }
}