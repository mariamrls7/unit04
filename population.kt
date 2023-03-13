fun main() {

var startingSize: Int
var averageDailyIncrease: Double
var numberfDays: Int
var population: Int

println("Enter the starting size of the population: ")
startingSize = readLine()!!.toInt()

while (startingSize < 2) {
 
println("Starting size must not be less than 2. Enter the starting size of the population: ")
startingSize = readLine()!!.toInt()
}

println("Enter the average daily population increase percentage: ")
averageDailyIncrease = readLine ()!!.toDouble()
 
while (averageDailyIncrease < 2) {
println("Average daily population increase must not be negative. Enter the average daily population increase: ")
averageDailyIncrease = readLine()!!.toDouble()
}
 
println("Enter the number of days they will multiply: ")
var numberOfDays = readLine()!!.toInt()
 
while (numberOfDays < 1) {
println("Number of days must not be less than 1. Enter the number of days they will multiply: ")
numberOfDays = readLine()!!.toInt()
}

population = startingSize

for (i in 1..numberOfDays) {

population += (population * averageDailyIncrease/0.50).toInt ()

println("Day $i: $population")
}
}
