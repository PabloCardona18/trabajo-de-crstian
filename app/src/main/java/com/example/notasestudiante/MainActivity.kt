package com.example.notasestudiante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    var campoTexto: EditText? = null
    var campoMateria: EditText? = null
    var camponota1: NumberFormat? = null
    var camponota2: NumberFormat? = null
    var camponota3: NumberFormat? = null
    var Calcular: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto=findViewById(R.id.PersonName)
        Calcular=findViewById(R.id.calcular)

        val Boton:Button= findViewById(R.id.calcular)
        Boton.setOnClickListener{onClick()}


    }

    private fun onClick() {
        var nombre: String= campoTexto!! .text.toString()
        Calcular!!.text="su nombre es $nombre"
        Toast.makeText( this, "su nombre es: $nombre", Toast.LENGTH_SHORT).show()
    }
}