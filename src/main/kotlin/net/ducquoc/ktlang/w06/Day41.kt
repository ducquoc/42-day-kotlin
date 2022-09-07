package net.ducquoc.ktlang.w06

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()
    println("Today: " + (date as LocalDate).dayOfMonth)
    if (date is LocalDate) {
        val month = date.monthValue // no need cast "date as LocalDate"
        println(month)
    }

    if (date != null) {
        println(date.isLeapYear)
    }
    if (date != null && date.isLeapYear) {
        println("It's a leap year!")
    }
    if (date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }
}