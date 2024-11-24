package cinema

val cinema = mutableListOf<MutableList<String>>()
var rows = 0
var seatsInRow = 0
var seats = 0
var rowNumber = 0
var seatNumber = 0
var ticketPrice = ""
var purchasedTickets = 0
var currentIncome = 0

fun main() {
    createScreenHall()
    createScreenHallGrid()
    menu()
}

fun createScreenHall() {
        println("Enter the number of rows:")
        rows = readln().toInt()
        println("Enter the number of seats in each row:")
        seatsInRow = readln().toInt()

    seats = rows * seatsInRow
}

fun createScreenHallGrid() {
    for (i in 0..rows) {
        cinema.add(mutableListOf())
        if (i == 0) {
            cinema[i].add("  ")
            for (s in 1..seatsInRow) {
                cinema[i].add("$s ")
            }
        }  else {
            cinema[i].add("$i ")
            for (s in 1..seatsInRow) {
                cinema[i].add("S ")
            }
        }
    }
}

fun showScreenHallGrid() {
    println()
    println("Cinema:")
    for (m in cinema.indices) {
        for (g in cinema[m].indices) {
            print(cinema[m][g])
        }
        println()
    }
    println()
    menu()
}

fun chooseSeat() {
    println("Enter a row number:")
    rowNumber = readln().toInt()
    println("Enter a seat number in that row:")
    seatNumber = readln().toInt()
    if (seats < 60 || (seats > 60 && rowNumber <= rows / 2)) {
        ticketPrice = "Ticket price: $10"
        currentIncome += 10
    } else {
        ticketPrice = "Ticket price: $8"
        currentIncome += 8
    }
    try {
        when {
            cinema[rowNumber][seatNumber] != "B " -> {
                println("\n$ticketPrice")
                cinema[rowNumber][seatNumber] = "B "
            }
            cinema[rowNumber][seatNumber] == "B " -> {
                println("\nThat ticket has already been purchased!\n")
                chooseSeat()
            }
        }
    } catch (e:IndexOutOfBoundsException) {
        println("\nWrong input!")
    }
    purchasedTickets++
    menu()
}

fun menu() {
    println()
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
        val choice = readln().toInt()
        when (choice) {
            1 -> showScreenHallGrid()
            2 -> chooseSeat()
            3 -> statistics()
            0 -> System.out
            else -> menu()
        }
}

fun statistics() {
    println()
    println("Number of purchased tickets: $purchasedTickets")
    println("Percentage: ${percentage()}%")
    println("Current income: \$$currentIncome")
    println("Total income: \$${totalIncome()}")
    menu()
}

fun percentage(): String {
    val percentage: Double = (purchasedTickets * 100) / seats.toDouble()
    return "%.2f".format(percentage)
}

fun totalIncome(): Int {
    val halfSeats = (rows / 2) * seatsInRow
    return if (seats < 60) {
        seats * 10
    } else {
        (halfSeats * 10) + (seats - halfSeats) * 8
    }
}