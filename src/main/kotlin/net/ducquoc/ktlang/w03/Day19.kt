package net.ducquoc.ktlang.w03

enum class State {
    IDLE, RUNNING, FINISHED
}
enum class Colour(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00),
    BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.RUNNING -> "It's running"
        else -> "It's not running"
    }
    println(message)

    val red = Colour.RED
    println(red)
    println(red.containsRed())
    println(Colour.BLUE.containsRed())
    // println(Color.YELLOW.containsRed())
}