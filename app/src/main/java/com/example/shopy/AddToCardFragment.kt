package com.example.shopy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AddToCardFragment : AppCompatActivity() {

    private var quantity = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_add_to_card)

        val productImageView = findViewById<ImageView>(R.id.product_image)
        productImageView.setImageResource(R.drawable.img_3)

        val productNameTextView = findViewById<TextView>(R.id.product_name)
        productNameTextView.text = "Product Name"

        val productPriceTextView = findViewById<TextView>(R.id.product_price)
        productPriceTextView.text = "$100"

        val addButton = findViewById<Button>(R.id.like_button)
        addButton.setOnClickListener {
            quantity++
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show()
        }

        val removeButton = findViewById<Button>(R.id.remove_button)
        removeButton.setOnClickListener {
            if (quantity > 0) {
                quantity--
                Toast.makeText(this, "Removed from Cart", Toast.LENGTH_SHORT).show()
            }
        }
    }
}