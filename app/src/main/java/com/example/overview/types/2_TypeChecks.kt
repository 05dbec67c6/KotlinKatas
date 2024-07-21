package com.example.overview.types

// you can use typechecks using the is or !is operator
// in order to use the is operator, you need to use another scope
/*
fun mainFunction() {
    val obj = 5
    if (obj is String) { // this wont compile, because it is known that the object is an int
        println("it is not a string")
    }

    fun isString(obj: Any): Boolean = obj is String // this works
    println(isString(obj))
}
*/

// the compiler tracks the data types so he is often able to cast (and check) a type itself

fun demo(x: Any) {
    if (x is String) {
        // here you dont need to explicitly cast any to string with .toString()
        print(x.length) // x is automatically cast to String
    }
    if (x !is String) return
    print(x.length)
}

// you can cast in an unsafe way using the operator as
val maybeString = "maybe i am a string"
val stringChecked = maybeString as String

// to avoid exceptions you can safe cast operator
val stringOrNull: String? = maybeString as? String



