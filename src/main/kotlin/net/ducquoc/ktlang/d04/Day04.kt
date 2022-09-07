package net.ducquoc.ktlang.d04

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int): Int = x * y

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main(){
    /* Function declaration/call, default arguments, named arguments */
    println(sum(1, 2)) // 3
    println(multiply(2, 4)) // 8

    fun maxIntOf(a: Int, b: Int) = if (a > b) a else b
    println("Max: ${maxIntOf(6, 7)}") // 7

    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log") // [Log] Hello
    printMessageWithPrefix("Hello") // [Info] Hello
    printMessageWithPrefix(prefix = "Log", message = "Hello") // [Log] Hello
}