package com.example.foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imagemLogo: ImageView
    lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagemLogo = findViewById(R.id.splash_view)
        btnEntrar = findViewById(R.id.entrar)
        btnEntrar.setOnClickListener{
            val intent = Intent(this,loguinActivity::class.java)
            Toast.makeText(this,"Seja bem vindo",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


    }
}