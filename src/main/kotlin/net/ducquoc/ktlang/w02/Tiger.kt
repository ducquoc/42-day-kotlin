package net.ducquoc.ktlang.w02

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

//fun main() {
//    val tiger: Tiger = SiberianTiger()
//    tiger.sayHello()
//}

class SiberianTiger : Tiger("Siberia")