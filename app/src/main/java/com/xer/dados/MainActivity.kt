  package com.xer.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lanzar()

        val lanzarDado: Button = findViewById<Button>(R.id.button)
        lanzarDado.setOnClickListener() { lanzar() }
    }


    private fun lanzar() {
        val dado = Dado(6)
        var resultado = dado.lanzar()
        val imagenDado : ImageView = findViewById<ImageView>(R.id.imageView)



        var resultadoDado = when(resultado){
            1 -> R.drawable.cara1
            2 -> R.drawable.cara2
            3 -> R.drawable.cara3
            4 -> R.drawable.cara4
            5 -> R.drawable.cara5
            else -> R.drawable.cara6
        }
        imagenDado.setImageResource(resultadoDado)

        imagenDado.contentDescription = resultado.toString()
    }

}

class Dado(val cantidadCaras: Int) {
    fun lanzar(): Int {
        return (1..cantidadCaras).random()
    }
}