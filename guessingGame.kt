import kotlin.math.roundToInt

fun main() {
 
val randNumber = (Math.random() * 
20).roundToInt() //random number from 0-20
 
println("I am thinking of a number between 0 - 20")
while (true) {
print("What's your guess?")
val input = Integer.parseInt(readLine())
println(input)
if (input == randNumber) {
println("Congrats you did it")
return
} else if(input > randNumber){
println ("Your guess is too high, try again...")
} else if (input < randNumber){
println ("Your guess is too low, try again...:")
}
}
}
