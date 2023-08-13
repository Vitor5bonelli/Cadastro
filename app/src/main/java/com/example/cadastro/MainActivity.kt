package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)
    }
}