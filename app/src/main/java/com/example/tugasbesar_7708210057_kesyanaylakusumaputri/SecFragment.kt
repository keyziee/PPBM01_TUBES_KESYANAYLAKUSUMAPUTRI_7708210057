package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.tugasbesar_7708210057_kesyanaylakusumaputri.costumLV

class SecFragment : Fragment() {
    private val contactList = listOf(
        Contact("Informasi Pribadi"),
        Contact("Kontak"),
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sec, container, false)
        val listView: ListView = view.findViewById(R.id.listView)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            contactList.map { it.nama }
        )

        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, position, _ ->
            showContactDetails(contactList[position])
        }

        return view
    }

    private fun showContactDetails(contact: Contact) {
        when (contact.nama) {
            "Informasi Pribadi" -> {
                // Ganti dengan pemanggilan aktivitas yang sesuai dengan layout baru (KelasBaruActivity)
                val intent = Intent(requireContext(), costumLV::class.java)
                startActivity(intent)
            }
            "Kontak" -> {
                // Ganti dengan pemanggilan aktivitas yang sesuai dengan layout baru (KelasBaruActivity)
                val intent = Intent(requireContext(), costumLV2::class.java)
                startActivity(intent)
            }
        }
    }
}

data class Contact(val nama: String)