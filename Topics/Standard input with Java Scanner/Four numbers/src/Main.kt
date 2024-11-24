import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        if (scanner.hasNextInt()) {
            println(scanner.nextInt())
        } else {
            scanner.close()
            break
        }

    }
}