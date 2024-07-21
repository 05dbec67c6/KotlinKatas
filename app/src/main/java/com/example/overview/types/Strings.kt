package com.example.overview.types


/*
If you modify a string, you are creating a new one
*/

// a string is declared like this
val stringName: String = "this is a string"

// a string is an array of chars and can be iterated through
// either with a for loop
fun stringForLoop(string: String) {
    for (i in string) {
        println(i)
    }
}

// or with a forEach{} loop
fun stringForEachLoop(string: String) {
    string.forEach { char ->
        println(char)
    }
}

// you can change a string to uppercase using .uppercase()
val uppercaseString: String = "this string".uppercase()

// you can change a string to lowercase using .lowercase()
val lowercaseString: String = "THIS STRING".lowercase()

// you can put strings together, thats called concatenate (verketten)
// if you want to have a linebreak in the code, the string needs to be the first element
val concatenatedString: String = "ABC" + "-" + "DEF"

/*
kotlin knows two string literals
escaped strings - escaped character has different functions
multiline strings
 */
val escapedString: String = """
\t – tab
\b – backspace
\n – new line (LF)
\r – carriage return (CR)
\' – single quotation mark
\" – double quotation mark
\\ – backslash
\$ – dollar sign
"""

val multilineString: String = """
first line 
second line
    third line"""

// chars can be unicode characters here eg U+00A6
val uniCodeChar = '\u00A6'

// you can use string templates
val exampleValue = 5
val stringTemplate: String = "The value is $exampleValue."

// if a value needs to be calculated, use an expression in curly braces
val stringTemplateWithBrackets: String = "The value is ${exampleValue + exampleValue}"

// you can use string formating
// val floatNumber = String.format("%+.4f", 3.141592)