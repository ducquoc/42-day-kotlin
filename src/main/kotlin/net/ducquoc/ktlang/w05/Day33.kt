package net.ducquoc.ktlang.w05

data class Persona(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Persona) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Persona("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}