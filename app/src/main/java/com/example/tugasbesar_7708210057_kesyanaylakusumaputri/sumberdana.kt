package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sumberdana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumberdana)

        val prfbtn = findViewById<Button>(R.id.prfbtn)
        prfbtn.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
        val secondActbutton = findViewById<Button>(R.id.menubutton)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, foodndrink::class.java)
            startActivity(Intent)
        }

        val registerbutton = findViewById<Button>(R.id.ratingbutton)
        registerbutton.setOnClickListener {
            val intent = Intent(this, rating::class.java)
            startActivity(intent)
        }
    }
}