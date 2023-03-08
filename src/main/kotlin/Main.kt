fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    print("Masukkan sebuah bilangan: ")
    val input = readLine()
    if (input != null) {
        val number = input.toInt()
        if (isPrime(number)) {
            println("$number adalah bilangan prima")
        } else {
            println("$number bukan bilangan prima")
        }
    } else {
        println("Input tidak valid")
    }
}
