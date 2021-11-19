package com.example.foods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoguinActivity : AppCompatActivity(){

    private lateinit var foods: TextView
    private lateinit var nomeRegisro: TextView
    private lateinit var emailUsuario: EditText
    private lateinit var senhaPrincipal: EditText
    private lateinit var btnLoguin: Button
    private lateinit var btnRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loguin_layout)

        foods = findViewById(R.id.log_in)

        val bundle = intent.getBundleExtra("bundle")
        foods.text = bundle?.getString("foods")
    }
}