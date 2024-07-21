package com.example.overview

// there are the following scope functions: apply, also, let, run

class ScopeFunctions(string: String, string2: String) {

    var string = string
    var string2 = string2

    fun printMe(){
        println( "$string + $string2")
    }
}



fun main(){
    val scopeFunction = ScopeFunctions("asdf", "fdas")
    scopeFunction.printMe()

    // APPLY
    // apply is used to initialize an object with propertys
    scopeFunction.apply {
        // you can either refer to the object as this
        this.string = "newString"
        // or directly use its properties
        string2 = "alsoNewString"

        //same with functions
        this.printMe()
        printMe()
    }
    // apply returns the receiver (the object itself)

    // ALSO
    // also is used to do some additional operations on an object
    // use it to log debug or validate without altering the object
        scopeFunction.also {
        println("This is for debugging")
    }
    // you can use it in method chaining
    scopeFunction.apply {
        string = "asdf"
    }.also {
        println("for debugging")
    }

    // LET
    // let it used for performing an operation if a value is not null
    // it is also used for temporary variables and function chaining
    var test : String? = null
    test?.let {
        println(it) // can refer to with it
        println("its not null") // will not be executed
    }

    // RUN




}