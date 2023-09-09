package com.labmember003.farmercompanion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.gsign).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            Toast.makeText(this, "Login Successful With avishishtgupta@gmail.com", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

    }
}