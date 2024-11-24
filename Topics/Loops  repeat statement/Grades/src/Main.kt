fun main() {
    val numberOfStudents = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(numberOfStudents) {
        val grade = readln().toInt()
        when (grade) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
            else -> println("Not Found")
        }
    }
    println("$d $c $b $a")
}