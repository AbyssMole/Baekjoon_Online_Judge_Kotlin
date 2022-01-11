package for문.`no2739 구구단`

fun main() {
    val num = readLine()!!.toInt()

    for(n in 1..9) {
        println("$num * $n = ${num * n}")
    }
}