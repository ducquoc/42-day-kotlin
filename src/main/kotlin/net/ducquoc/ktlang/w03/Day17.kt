package net.ducquoc.ktlang.w03

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // a == b means equality: if (a == null) b == null else a.equals(b)
    println(authors == writers)
    // a === b means same identity/reference
    println(authors === writers)
}