package net.ducquoc.ktlang.d06

fun main(){
    var neverNull: String = "This can't be null" // @NotNull
//    neverNull = null
    var nullable: String? = "You can keep a null here" // @Nullable
    nullable = null
    var inferredNonNull = "The compiler assumes non-null" // "String" not "String?"
//    inferredNonNull = null
    println("neverNull=$neverNull, nullable=$nullable, inferredNonNull=$inferredNonNull")

    fun strLength(notNull: String): Int {
        return notNull.length
    }
    strLength(neverNull)
//    strLength(nullable) // Nothing? != Any?
//    println(describeString(null))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}: $maybeString"
    } else {
        return "Empty or null string"
    }
}