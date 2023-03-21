package com.example.quickstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    class Automovil (){

        var marca: String = ""
        var color: String = ""
        var precio: Int = 0
        var velocidadMax: Int = 0

        fun encender(){
            println("")
        }

        fun apagar(){
            println("")
        }

        fun acelerar(){
            println("")
        }

        fun detenerce(){
            println("")
        }

    }





}















