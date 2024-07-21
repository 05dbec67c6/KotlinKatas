package com.example.overview

import com.example.overview.types.MyDataClass

class Variables {

    val someClass = MyDataClass("asdf", "fdsa")

    // Desctructuring is only allowed for local variables
    fun desctructuring() {
        val (dear, text) = someClass
        println(dear)
    }

}