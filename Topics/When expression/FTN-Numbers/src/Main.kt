fun main() {
    val fibbo = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val triange = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val power = listOf(1, 10, 100, 1000, 10000, 100000)

    val input = readln().toInt()
    val result = when  {
        fibbo.contains(input) -> "F"
        triange.contains(input) -> "T"
        power.contains(input) -> "P"
        else -> "N"
    }
    println(result)
}