package net.ducquoc.ktlang.w05

inline fun onlyIf(check: Boolean, operation: () -> Unit) {
    if (check) {
        operation()
    }
}

fun main(){
    val shouldPrint = true
    onlyIf(shouldPrint) {
        println("Hello, Kotlin")
    }
//    if (shouldPrint) { // execution: no need to create lambda
//        println("Hello, Kotlin")
//    }
}