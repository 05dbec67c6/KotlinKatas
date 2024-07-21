package com.example.overview.types

data class MyDataClass(
    val dear: String,
    val text: String)

// In data classes you can use copy
fun copy(){
    val oldClass = MyDataClass("testing", "westing")
    val copiedClass = oldClass.copy("wuseldusel")
    println(copiedClass)
}

