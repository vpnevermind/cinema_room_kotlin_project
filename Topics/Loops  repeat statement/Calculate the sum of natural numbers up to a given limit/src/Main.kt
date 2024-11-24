// Import necessary Kotlin libraries
import java.util.*

fun main(args: Array<String>) {
    // Create a scanner object for getting input
    val scanner = Scanner(System.`in`)

    // Read the input number
    val N = scanner.nextInt()

    // Variable to store the sum
    var sum = 0

    for (i in 1..N) {
        sum += i
    }

    println(sum)
}