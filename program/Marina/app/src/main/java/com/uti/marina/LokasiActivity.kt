package com.uti.marina

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LokasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lokasi)

        // ... (kode sebelumnya untuk mengatur padding) ...

        findViewById<View>(R.id.btnTampilPeta).setOnClickListener { view ->
            val urllokasi = Uri.parse("google.navigation:q=Pantai Marina, Kalianda Lampung Selatan")
            val pindah = Intent(Intent.ACTION_VIEW, urllokasi)
            startActivity(pindah)
        }
    }
}
