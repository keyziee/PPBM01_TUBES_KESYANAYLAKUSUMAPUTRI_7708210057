package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class costumLV : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_costum_lv)

        val myListData = mutableListOf<MyData>()

        myListData.add(MyData(R.drawable.biodata, "Kesya Nayla Kusuma Putri", "7708210057_D4SM4501"))
        myListData.add(MyData(R.drawable.gemini, "Zodiak", "Gemini"))

        val myListView = findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = MyCostumAdapter(this, myListData)
    }
}