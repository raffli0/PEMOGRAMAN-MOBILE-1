package com.example.inputcontrol

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var PhoneNumber: EditText
    private lateinit var btnShowAlert: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PhoneNumber = findViewById(R.id.PhoneNumber)
        btnShowAlert = findViewById(R.id.btnShowAlert)

        btnShowAlert.setOnClickListener {
            val phoneNumber = PhoneNumber.text.toString().trim()

            if (phoneNumber.isEmpty()) {
                showAlert("Nomor telepon tidak boleh kosong!")
            } else {
                showAlert("Nomor telepon: $phoneNumber telah ditambahkan")
            }
        }
    }

    private fun showAlert(message: String) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()
    }
}
