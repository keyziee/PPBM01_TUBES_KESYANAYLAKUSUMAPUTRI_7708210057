package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar

class registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val btnregistrasi = findViewById<Button>(R.id.btnregistrasi)

        btnregistrasi.setOnClickListener {
            showSnackbar(it, "Data Berhasil di imput")
        }
    }

    private fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()

        val secondActbutton = findViewById<Button>(R.id.registrasiButton)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, sumberdana::class.java)
            startActivity(Intent)
        }



        }

    }

