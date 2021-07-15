package com.xer.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lanzarDado: Button = findViewById<Button>(R.id.button)
        lanzarDado.setOnClickListener() { lanzar() }
    }


    private fun lanzar() {
        val dado = dado(6)
        var numeroDado: TextView = findViewById<TextView>(R.id.textView)
        numeroDado.text = dado.lanzar().toString()
    }

}

class dado(val cantidadCaras: Int) {
    fun lanzar(): Int {
        return (1..cantidadCaras).random()
    }
}