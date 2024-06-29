package com.uti.marina // Sesuaikan dengan package Anda

import android.content.Intent
desifitriaa
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.uti.marina.LokasiActivity
master

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Inisialisasi tombol dan set onClick listener
        val galeriButton: Button = findViewById(R.id.button3)
        galeriButton.setOnClickListener {
            val intent = Intent(this, GaleriActivity::class.java)
            startActivity(intent)
        }
    }
desifitriaa

    fun tampilkanLokasi(view: View) {val intent = Intent(this, LokasiActivity::class.java)
        startActivity(intent)
    }

    fun tampilkanPaket(view: View) {val intent = Intent(this, PaketActivity::class.java)
        startActivity(intent)
    }


    fun Galeri(view: View) {}
master
}
