package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBoardingScreen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen2)

        var onBoardButton2Button = findViewById<Button>(R.id.button2)

        onBoardButton2Button.setOnClickListener {
            val intent = Intent(this, onBoardingScreen3::class.java)
            startActivity(intent)
            finish()
        }
    }


}
