package com.example.shopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PersonFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_person)

        val nameTextView = findViewById<TextView>(R.id.name_text)
        nameTextView.text = "Shaina"

        val emailTextView = findViewById<TextView>(R.id.email_text)
        emailTextView.text = "shainakhatun21@navgurukul.org"

        val passwordTextView = findViewById<TextView>(R.id.password_text)
        passwordTextView.text = "12345678"

        val profileImageView = findViewById<ImageView>(R.id.profile_image)
        profileImageView.setImageResource(R.drawable.img_21)

        val logoutButton = findViewById<Button>(R.id.logout_button)
        logoutButton.setOnClickListener {
            // Perform logout action
        }
    }
}