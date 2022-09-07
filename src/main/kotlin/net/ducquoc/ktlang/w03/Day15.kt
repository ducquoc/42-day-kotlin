package net.ducquoc.ktlang.w03

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++ // up to 5
    }

    do {
        bakeACake()
        cakesBaked++ // up to cakesEaten
    } while (cakesBaked < cakesEaten)
}