package com.example.quickstart

class Moto (mar: String, col: String, pre: Int ){

        var marca: String = mar
        var color: String = col
        var precio: Int = pre
        var velocidadMax: Int = 0

            get() = field + 3

            set(vel) {
                if (vel < 200){
                    field
                }
            }

    private fun encender(){
            println("La Moto " + marca + " ha encendido")
        }

        fun apagar(){
            println("La Moto se ha apagado")
        }

        fun acelerar(){
            println("la Moto esta acelerando")
        }

        fun detenerce() {
            println("El auto se ha detenido")
        }


}

