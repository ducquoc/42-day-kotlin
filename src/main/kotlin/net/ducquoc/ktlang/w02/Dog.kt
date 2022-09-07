package net.ducquoc.ktlang.w02

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class PitBull : Dog() {
    override fun sayHello() {
        println("go go!")
    }
}

fun main() {
    val dog: Dog = PitBull()
    dog.sayHello()
}