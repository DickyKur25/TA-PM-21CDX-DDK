package com.uti.marina // Sesuaikan dengan package Anda

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.uti.marina.LokasiActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Tambahkan kode untuk inisialisasi tampilan dan logika di HomeActivity
    }

    fun tampilkanLokasi(view: View) {val intent = Intent(this, LokasiActivity::class.java)
        startActivity(intent)
    }

    fun tampilkanPaket(view: View) {val intent = Intent(this, PaketActivity::class.java)
        startActivity(intent)
    }

    fun tampilkanGaleri(view: View) {val intent = Intent(this, GaleriActivity::class.java)
        startActivity(intent)
    }

}