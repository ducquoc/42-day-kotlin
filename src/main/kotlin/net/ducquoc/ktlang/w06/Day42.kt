package net.ducquoc.ktlang.w06

fun main(args: Array<String>) {
    fun getIndices(count: Int): List<Int> {
        require(count >= 0) { "Count must be non-negative, was $count" }
        // ...
        return List(count) { it + 1 }
    }

    // getIndices(-1) // will fail with IllegalArgumentException

    println(getIndices(3)) // [1, 2, 3]

    var someState: String? = null
    fun getStateValue(): String {
        val state = checkNotNull(someState) { "State must be set beforehand" }
        check(state.isNotEmpty()) { "State must be non-empty" }
        // ...
        return state
    }

    // getStateValue() // will fail with IllegalStateException

    someState = ""
    // getStateValue() // will fail with IllegalStateException

    someState = "non-empty-state"
    println(getStateValue()) // non-empty-state
}