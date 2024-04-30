package com.experiments.animationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.experiments.animationtest.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}