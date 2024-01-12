package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class foodndrink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodndrink)
        val secondActbutton = findViewById<Button>(R.id.orderbutton)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, pembelian::class.java)
            startActivity(Intent)
        }
    }
}