package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Homepage_after_login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_after_login)

        val btnSpeakingPractice = findViewById<ImageView>(R.id.imageView9)
        btnSpeakingPractice.setOnClickListener {
            val intent = Intent(this, Speaking_practice::class.java)
            startActivity(intent)
        }

        val btnBuyLessons = findViewById<ImageView>(R.id.imageView11)
        btnBuyLessons.setOnClickListener {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

        val btnMessage = findViewById<ImageView>(R.id.imageView10)
        btnMessage.setOnClickListener {
            val intent = Intent(this, Message::class.java)
            startActivity(intent)
        }

    }
}