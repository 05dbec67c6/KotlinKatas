package com.example.overview.types

val booleanTrue: Boolean = true
val booleanFalse: Boolean = false

val boolean1 = true
val boolean2 = false

// booleans have in built-in operations
fun testBoolean() {
    if (boolean1 == boolean2) {
        println("true")
    }
}

// booleans can be tested with || OR operator, meaning if either one of this OR that is true
// the whole expression will become true
// the difference between || and "or" is that latter is not short cuircited, means it will always
// calculated the right expression as well
// if the first operand is true, the second will not be evaluated
fun booleanOr() {
    if (true || false) {
        println("its true")
    }
    if (false || true) {
        println("its true")
    }
    if (false || false) {
        println("its true")
    } else {
        println("its false")
    }
}

// booleans can be tested with && AND operator, meaning if bothe this AND that need to be true
// to make the whole expression become true
// the difference between && and "and" is that latter is not short cuircited, means it will always
// calculated the right expression as well
// If the first operand is false, the second will not be evaluated
fun booleanAnd() {
    if (true && false) {
        println("its false")
    }
    if (false && true) {
        println("its false")
    }
    if (true && true) {
        println("its true")
    }
}

// you can negate the condition with !
// !true = false
// !false = true