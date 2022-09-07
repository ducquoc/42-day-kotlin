package net.ducquoc.ktlang.w02

fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

    for (i in 'a' .. 'g') { // 'a' until 'g'
        print("$i ")
    }
    println(" === ")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println(" --- ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
}