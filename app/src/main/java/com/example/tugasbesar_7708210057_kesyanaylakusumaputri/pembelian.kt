package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.ncorti.slidetoact.SlideToActView

class pembelian : AppCompatActivity() {
    private lateinit var list: Spinner
    private lateinit var btn_pilih: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembelian)
        list = findViewById(R.id.list_makanan)
        btn_pilih = findViewById(R.id.btn_pilih)

        btn_pilih.setOnClickListener {
            val toast =
                Toast.makeText(this, "kamu memilih! ${list.selectedItem}", Toast.LENGTH_SHORT)
            toast.show()

            val slide = findViewById<SlideToActView>(R.id.example)
            slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
                override fun onSlideComplete(view: SlideToActView) {
                    val _intent = Intent(this@pembelian, donebelanja::class.java)
                    startActivity(_intent)
                }
            }
        }
    }
}