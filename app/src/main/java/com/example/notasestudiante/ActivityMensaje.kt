package com.example.notasestudiante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val campomensaje=findViewById<TextView>(R.id.calcular)

        var miBundle: Bundle? =this.intent.extras

        if (miBundle != null){
            campomensaje.text="hola señor ${miBundle.getString("nombre")} "
        }


        }
    private fun onClick(){
        finish()
    }
}