fun main() {
    val number = readln().toInt()
    when {
        number > 0 -> println("positive")
        number < 0 -> println("negative")
        else -> println("zero")
    }
}