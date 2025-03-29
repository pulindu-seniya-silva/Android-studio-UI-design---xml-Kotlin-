package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class User_profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile)

        val googleSignInButton = findViewById<ImageView>(R.id.appLogo)
        googleSignInButton.setOnClickListener {
            val intent = Intent(this, Homepage_after_login::class.java)
            startActivity(intent)
            finish()
        }

    }
}