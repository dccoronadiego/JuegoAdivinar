package com.example.primerjuego

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnIniciar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar = findViewById(R.id.btnComenzar)

        btnIniciar.setOnClickListener {

            val abrirJuego = Intent(this, JuegoActivity::class.java)
            startActivity(abrirJuego)
        }

    }
}
