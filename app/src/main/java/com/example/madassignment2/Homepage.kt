package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var onBoardScreen3Button = findViewById<ImageView>(R.id.user1)

        onBoardScreen3Button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

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

        val btnFindFriends = findViewById<ImageView>(R.id.imageView12)
        btnFindFriends.setOnClickListener {
            val intent = Intent(this, Find_friends::class.java)
            startActivity(intent)
        }
    }

}