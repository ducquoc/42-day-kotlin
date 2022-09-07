package net.ducquoc.ktlang.w02

class User {
    /* properties, var/val, custom getter/setter */
    val id: String = "" // immutable (khong sua duoc) --> read-only, chi co getter
    var name: String = "" // default getter and setter
    var surname: String = "" // custom getter, default setter
        get() = this.name.toUpperCase() // custom getter declaration

    var email: String = "" // default getter, custom setter
        set(value) { // custom setter declaration
            // "value" = name of the setter parameter
            // "field" = property's backing field; generated
            if (isEmailValid(value)) field = value
        }

    private fun isEmailValid(value: String): Boolean {
        return value.matches("[a-zA-Z0-9_\\-]{1,254}@[a-zA-Z0-9\\-]{1,64}.[a-zA-Z0-9]{1,25}".toRegex())
    }
}

fun main(){
    val user = User()
    user.name = "name1"
    user.email = "user1@gmail.com"
    println("name=${user.name}, surname=${user.surname}, email=${user.email}")
    user.email = "user1update@gmail.com"
    println(user.email)
}