package net.ducquoc.ktlang.w03

fun main() {
    val (x, y, z) = arrayOf(5, 10, 15) // immutable array

    val map = mapOf("Alice" to 21, "Bob" to 25) // immutable map
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83)) // immutable list
}

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}