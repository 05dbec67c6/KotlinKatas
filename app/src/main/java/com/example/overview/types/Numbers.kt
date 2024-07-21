package com.example.overview.types

// The byte reaches from -128 to 127
// The byte has 8 bits
val lowestByteValue: Byte = -128
val highestByteValue: Byte = 127

// The short reaches from -32768 to 32767
// One short has 16 bits
val lowestShortValue: Short = 32767
val highestShortValue: Short = -32768

// The int reaches from -2,147,483,648 to 2,147,483,647
// One int has 32 bits
val lowestIntValue: Int = -2_147_483_648
val highestIntValue: Int = 2_147_483_647

// The long reaches from -10 trillion
// One long has 64 bits
val lowestLongValue: Long = -9_223_372_036_854_775_807 - 1
val highestLongValue: Long = 9_223_372_036_854_775_807

// when you initialize a value the default is int, you can explicitly declare a type eg with L or
// explicitly declare a type
val longValue: Long = 15L
val anotherLongValue: Long = 15

// There are double and floats, meaning they have a dot
val float: Float = 2.0F
val double: Double = 1.0
// for precision better always use a double


// There are the following kinds of literal constants for integral values:

val decimal = 123
val long = 123L
val hexDecimal = 0x0F
val binaries = 0b00001011

// you can use underscores to make ints more readable
val underscoredInt: Int = 1_354_345_546

// numbers can use operators +, -, *, /, %
val plusResult = 1 + 1 // 2

val minusResult = 1 - 4 // -3

val productResult = 5 * 3 // 15

val divideResult = 21 / 7 // 3

// if you divide integers, it will always be rounded down to next integer
val divideResult2 = 40 / 6 // 6

// to return a floating point value you need to convert one of the numbers to a float value
val divideResult3 = 40 / 6.toDouble()

val restOperator = 50 % 10 // 0
val restOperator2 = 50 % 9 // 5

// there is also a possibility for bitwise operations, not going into deeper here

// numbers can have
// equality checks with ==
// comparison checks with <, >, <=, >=
val equality = (4 == 5)

// numbers can be initiated in ranges
val x = 5
val rangeCheck = (x in 4..7)
val rangeCheckNOT = (x !in 4..7)

fun main() {
    println(rangeCheckNOT)
}