package com.uti.marina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

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
}
