package net.ducquoc.ktlang.w04

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1
    val positives = numbers.filter { x -> x > 0 }  // 2
    val negatives = numbers.filter { it < 0 }      // 3
    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")

    val doubled = numbers.map { x -> x * 2 }      // 2
    val tripled = numbers.map { it * 3 }          // 3
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")

    val anyNegative = numbers.any { it < 0 }             // 2
    val anyGT6 = numbers.any { it > 6 }
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

    val firstEven = numbers.first { it % 2 == 0 }        // 4
    val lastOdd = numbers.last { it % 2 != 0 }           // 5
    println("first even $firstEven, last odd $lastOdd")
}