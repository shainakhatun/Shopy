package com.example.shopy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class JoinActivity : AppCompatActivity() {
    lateinit var join: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)


        var login = findViewById<Button>(R.id.loginBtn)

        join.setOnClickListener() {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        login.setOnClickListener() {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
