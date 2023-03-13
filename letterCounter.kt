fun main () {
val letters = "The program should count and display the number of times that the specified character appears in the string"

val countOfChar = letters
        .filter { it == 'e' }
        .length

println(countOfChar) 

}
