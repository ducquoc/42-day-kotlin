package net.ducquoc.ktlang.d07

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    /* classes */
    val customer = Customer() // no need "new" keyword
    val contact = Contact(1, "mary@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)
}