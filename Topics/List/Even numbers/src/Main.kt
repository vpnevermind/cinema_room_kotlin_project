fun solution(numbers: List<Int>) {
    for (n in numbers) {
        if (n % 2 == 0) {
           print("$n ")
        }
    }
}

fun main() {
    val numbers = listOf(8, 11, 13, 2)
    solution(numbers)
}