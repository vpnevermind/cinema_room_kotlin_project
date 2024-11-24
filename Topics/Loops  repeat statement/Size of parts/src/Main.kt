fun main() {
    val inputSize = readln().toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0
    repeat(inputSize) {
        val input = readln().toInt()
        when (input) {
            0 -> perfect++
            1 -> larger++
            -1 -> smaller++
        }
    }
    println("$perfect $larger $smaller")
}