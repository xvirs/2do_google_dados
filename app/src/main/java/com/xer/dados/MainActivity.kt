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

        val lanzarDado : Button = findViewById<Button>(R.id.button)


        var primerDado = dado(6)
        println("El dado de ${primerDado.cantidadCaras} caras devolvio el valor random de ${primerDado.lanzar()}" )

        var segundoDado = dado(20)
        println("Si el Dado tiene ${segundoDado.cantidadCaras} caras , entonces el numero random sera ${segundoDado.lanzar()}")

        lanzarDado.setOnClickListener(){

            val toast = Toast.makeText(this, "Dado Lanzado!", Toast.LENGTH_SHORT)
            toast.show()

            println("Se lanzo el dado bro ! ")

            lanzar()
        }
    }


    private fun lanzar() {
        val dado = dado(6)
        var numeroDado : TextView = findViewById<TextView>(R.id.textView)
        numeroDado.text = dado.lanzar().toString()
    }

}

class dado(val cantidadCaras: Int){
    fun lanzar(): Int  {
        return (1..cantidadCaras).random()
    }
}