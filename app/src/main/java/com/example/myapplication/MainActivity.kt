package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tombol = findViewById(R.id.btn1) as Button

        btn1.setOnClickListener{
            val nama = name.text.toString()
            if (nama == null || nama.trim() == "")
                Toast.makeText(this@MainActivity, "Nama tidak boleh kosong !!", Toast.LENGTH_SHORT).show()
            else {
                textBase.setText(nama)

//                change image
                val imgRes = resources.getIdentifier(nama,"drawable", packageName)
                img1.setImageResource(imgRes)
            }
        }
    }
}
