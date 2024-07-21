package com.example.overview

var collection = listOf(1, 34, 5, 6, 7, 2, 12, 3)

// to get the index in a for loop, use withIndex()
fun loopWithIndex(collection: List<Int>) {
    for ((index, value) in collection.withIndex()) {
        println("$index + $value")
    }
}
