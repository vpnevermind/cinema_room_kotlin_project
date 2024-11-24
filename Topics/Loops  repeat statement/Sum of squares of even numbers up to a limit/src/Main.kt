import java.util.Scanner

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        // Write a loop here to calculate the sum of squares of even numbers up to the limit
        // Use the 'repeat' construct
        var sum = 0
        repeat(limit + 1) {
            if (it % 2 == 0) {
                sum += it * it
            }
        }
        println(sum)
    }
    
}
