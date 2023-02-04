package com.example.shopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageDispaly=intent.getStringExtra("image")
        val nameDisplay=intent.getStringExtra("name")
        val idDisplay=intent.getStringExtra("id")

        Glide.with(this).load(imageDispaly).into(findViewById(R.id.imageViewJk_id))

    }
}