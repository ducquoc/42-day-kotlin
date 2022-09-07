package net.ducquoc.ktlang.w05

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = People("Sophia")
    val claudia = People("Claudia")
    sophia likes claudia                                       // 5
}

class People(val name: String) {
    val likedPeople = mutableListOf<People>()
    infix fun likes(other: People) { likedPeople.add(other) }  // 6
}