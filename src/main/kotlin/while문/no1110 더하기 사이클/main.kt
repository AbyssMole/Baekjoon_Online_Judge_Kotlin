package while문.`no1110 더하기 사이클`

fun main() {
    var number = readLine()!!
    var firstN = ""
    var count = 0

    if(number.length < 2)
        number += "0"

    firstN = number

    while (true) {
        val numberB = (number[0].toString().toInt() + number[1].toString().toInt()).toString()
        val result = (number[number.length - 1].toString() + numberB[numberB.length - 1].toString())
        count++

        if(result == firstN) break

        number = result
    }

    println(count)
}