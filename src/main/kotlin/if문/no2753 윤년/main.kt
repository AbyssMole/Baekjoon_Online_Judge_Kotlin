package if문.`no2753 윤년`

fun main() {
    val year = readLine()!!.toInt()

    when {
        year % 400 == 0 -> println("1")
        year % 4 == 0 && year % 100 != 0 -> println("1")
        else -> println("0")
    }
}