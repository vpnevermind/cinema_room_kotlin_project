fun main() {
    val input = readLine()!!

    if (!input.isEmpty()) {
        val result = when {
            input.first() == 'i' -> input.drop(1).toInt() + 1
            input.first() == 's' -> input.drop(1).reversed()
            else -> input
        }
        println(result)
    }

}