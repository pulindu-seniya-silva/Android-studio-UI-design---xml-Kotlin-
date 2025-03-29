package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBordingScreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_on_bording_screen1)

        var onBoardindButton1 = findViewById<Button>(R.id.button1)

        onBoardindButton1.setOnClickListener {
            val intent = Intent(this, onBoardingScreen2::class.java)
            startActivity(intent)
            finish()
        }
    }


}