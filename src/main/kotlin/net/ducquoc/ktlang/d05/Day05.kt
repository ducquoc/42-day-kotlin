package net.ducquoc.ktlang.d05

import kotlin.random.Random

fun main(){
    /* variables, var, val */
    var a: String = "initial"
    println(a) // variable "must be initialized" before reading
    val b: Int = 1
    val c = 3
    println("b=$b, c=$c")

    val d: Int
    if (Random.nextBoolean()) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}