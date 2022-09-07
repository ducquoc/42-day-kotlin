@file:JvmName("Day03Kt")

package net.ducquoc.ktlang.d03

fun main(){
    /* String template, String interpolation */
    val language = "Kotlin"
    val text = "$language has ${language.length} characters"
    println(text) // "Kotlin has 6 characters"

    // simple name in template:
    var a = 1
    val s1 = "a is $a"
    println(s1) // "a is 1"
    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}