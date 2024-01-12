package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class costumLV2 : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_costum_lv)

            val myListData = mutableListOf<MyData>()

            myListData.add(MyData(R.drawable.gmail, "Gmail", "Kesyannn@gmail.com"))
            myListData.add(MyData(R.drawable.kontak, "Nomor Telefon", "087776666070"))

            val myListView = findViewById<ListView>(R.id.my_list_view)
            myListView.adapter = MyCostumAdapter(this, myListData)
        }
    }
