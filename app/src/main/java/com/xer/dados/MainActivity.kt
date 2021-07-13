package com.xer.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var primerDado = dado(6)
        println("El dado de ${primerDado.cantidadCaras} caras devolvio el valor random de ${primerDado.lanzar()}" )

        var segundoDado = dado(20)
        println("Si el Dado tiene ${segundoDado.cantidadCaras} caras , entonces el numero random sera ${segundoDado.lanzar()}")
    }


}

class dado(val cantidadCaras: Int){

    fun lanzar(): Int  {
        return (1..cantidadCaras).random()
    }
}