package `1차원 배열`.`no3052 나머지`

fun main() {
    val numbers = arrayListOf<Int>()

    for(i in 1..10) {
        val number = readLine()!!.toInt() % 42
        numbers.add(number)
    }

    val result = numbers.distinct()

    println(result.size)
}