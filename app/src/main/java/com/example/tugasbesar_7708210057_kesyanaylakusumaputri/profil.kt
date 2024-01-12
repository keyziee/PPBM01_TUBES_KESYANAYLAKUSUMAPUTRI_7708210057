package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tugasbesar_7708210057_kesyanaylakusumaputri.databinding.ActivityProfilBinding
import com.example.tugasbesar_7708210057_kesyanaylakusumaputri.databinding.SheetFirstViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class profil : AppCompatActivity() {

    private val binding by lazy { ActivityProfilBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener {
            showBottomSheet()
        }


        val secondActbutton = findViewById<Button>(R.id.hmbtn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, sumberdana::class.java)
            startActivity(Intent)
        }
    }

    private fun showBottomSheet(){
        val sheetDialog = BottomSheetDialog(this)
        val sheetBinding = SheetFirstViewBinding.inflate(layoutInflater)
        sheetDialog.apply {
            setContentView(sheetBinding.root)
            show()
        }
        sheetBinding.btnOk.setOnClickListener {
            sheetDialog.dismiss()
        }
    }
}
