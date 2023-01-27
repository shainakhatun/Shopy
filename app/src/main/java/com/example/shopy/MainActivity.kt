package com.example.shopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_splash)
        setContentView(R.layout.fragment_home)
        setContentView(R.layout.fragment_menu)
        setContentView(R.layout.fragment_person)
        setContentView(R.layout.fragment_add_to_card)

    }
}