import java.util.Scanner

fun main() {
    val list = mutableListOf<Int>()

    val size = readln().toInt()
    for (i in 0 until size) {
        list.add(readln().toInt())
    }
    val shifts = readln().toInt() % size

    shiftItem(list, shifts)

}

fun shiftItem(list: MutableList<Int>,shifts: Int) {
    val result = mutableListOf<Int>()
    for (n in list.indices) {
        if (n + shifts > list.lastIndex) {
            result.add(list[n])
        }

    }
    for (i in list.indices) {
        if (i + shifts <= list.lastIndex) {
            result.add(list[i])
        }
    }
    println(result.joinToString(" "))
}

// 0 1 2 3 4