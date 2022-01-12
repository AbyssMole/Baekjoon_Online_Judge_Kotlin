package `1차원 배열`.`no2562 최댓값`

fun main() {
    val numberArray = arrayListOf<Int>()

    for(n in 1..9)
        numberArray.add(readLine()!!.toInt())

    val max = numberArray.maxOrNull()
    val maxIndex = numberArray.indexOf(max) + 1

    println("$max\n$maxIndex")
}