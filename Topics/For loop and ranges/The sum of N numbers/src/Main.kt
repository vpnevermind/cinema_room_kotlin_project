fun main() {
    val num = readln().toInt()
    var sum = 0
    repeat(num) {
        val a = readln().toInt()
        sum += a
    }
    println(sum)
}