package com.uti.marina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (validateInput(username, password)) {
                // Validasi berhasil, lanjutkan ke HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun validateInput(username: String, password: String): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Username dan password harus diisi!", Toast.LENGTH_SHORT).show()
            return false
        }

        // TODO: Ganti dengan logika validasi yang sesuai (misalnya, cek ke database)
        if (username == "user" && password == "password") {
            return true
        } else {
            Toast.makeText(this, "Login gagal!", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}
