package net.ducquoc.ktlang.w04

fun String?.dup(): String? {
    return if (this == null) null else (this + this)
}

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

class MyClass {
    companion object { }  // will be called "Companion"
}
fun MyClass.Companion.printCompanion() { println("companion") }

fun main() {
    println("SomeStr".dup())
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
    MyClass.printCompanion()
}