package com.example.madassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val googleSignInButton = findViewById<Button>(R.id.buttonLogin)
        googleSignInButton.setOnClickListener {
            val intent = Intent(this, User_profile::class.java)
            startActivity(intent)
            finish()
        }
    }

}