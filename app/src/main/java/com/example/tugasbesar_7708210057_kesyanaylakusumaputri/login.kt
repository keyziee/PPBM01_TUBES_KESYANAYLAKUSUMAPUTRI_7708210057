package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerbutton = findViewById<Button>(R.id.registerbutton)
        registerbutton.setOnClickListener {
            val intent = Intent(this, registrasi::class.java)
            startActivity(intent)
        }
        val secondActbutton = findViewById<Button>(R.id.loginbutton)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, sumberdana::class.java)
            startActivity(Intent)
        }
    }
}