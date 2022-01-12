package `1차원 배열`.`no10818 최소, 최대`

fun main() {
    val count = readLine()!!.toInt()
    val numbers = readLine()!!.split(' ')
    val array = arrayListOf<Int>()

    for(n in numbers)
        array.add(n.toInt())

    println("${array.minOrNull()} ${array.maxOrNull()}")
}