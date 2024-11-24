import java.util.*

fun main(args: Array<String>) {
    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    val numbers = scanner.nextLine().split(" ")
    for (n in numbers) {
        numberList.add(n.toInt())
    }
    numberList.sort()
    println(numberList.joinToString(" "))
}