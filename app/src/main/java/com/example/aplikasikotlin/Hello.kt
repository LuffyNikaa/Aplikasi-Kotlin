package com.example.aplikasikotlin

class Person(val name: String, val hobby: Hobby) {
    fun describeHobby() {
        println("Halo, nama saya $name saya memiliki hobi ${hobby.name}. ${hobby.description}")
    }
}

class Hobby(val name: String, val description: String)

fun main() {
    val game = Hobby("Main Game", "Main game adalah suatu kegiatan yang bisa meredakan stres atau juga bisa menambah stres.")
    val angger = Person("Angger Rahmadi", game)
    angger.describeHobby()
}
