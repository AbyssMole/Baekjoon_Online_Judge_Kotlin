package `입출력과 사친연산`.`no3003 킹, 퀸, 룩, 비숍, 나이트, 폰`

fun main() {
    val objectCounts = listOf<Int>(1, 1, 2, 2, 2, 8)
    val objects = readLine()!!.split(" ")
    
    for(value in objects.withIndex()) {
        print("${objectCounts[value.index] - value.value.toInt()}" + " ")
    }
}