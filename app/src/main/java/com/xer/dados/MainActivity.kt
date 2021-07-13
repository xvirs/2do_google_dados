package com.xer.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rangoRandom = 1..6

        val numeroRandom = rangoRandom.random()

        println("El numero random creado es : ${numeroRandom}")

        var primerDado = dado()


        println("La cantidasd de caras que teiene un dado es > ${primerDado.caras}")
        primerDado.lanzar()
    }


}

class dado{
    val caras = 6;

    fun lanzar() {
        var numeroRandom = (1..6).random()
        println(numeroRandom)
    }
}