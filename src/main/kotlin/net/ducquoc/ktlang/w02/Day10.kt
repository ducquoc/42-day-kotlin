package net.ducquoc.ktlang.w02

class Person {
    var name: String? = null
    var age: Int? = 42
}

fun main(){
    /* Elvis operator, null safe call */
    var person = Person()
    val name: String = person.name ?: "NullDefault"
    val age = person.age ?: return
    println("name=$name, age=$age")

    var np: Person? = null
    println("nullable person name=${np?.name}, age=${np?.age}")
    // print(name!!.length)
}