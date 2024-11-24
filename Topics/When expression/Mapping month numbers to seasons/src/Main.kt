import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the input month number
    val monthNumber = scanner.nextInt()

    // Use a when expression to determine the corresponding season
    val season = when (monthNumber) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Fall"
        else -> "Invalid month number"
    }

    println(season)
}