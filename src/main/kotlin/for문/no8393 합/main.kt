package for문.`no8393 합`

fun main() {
    val number = readLine()!!.toInt()
    var sum = 0

    for(n in 1..number)
        sum += n

    println(sum)
}