package `기본 수학 1`.`no2292 벌집`

fun main() {
    val number = readLine()!!.toInt()
    var roomCount = 1
    var upCount = 6
    var moveCount = 1

    while (roomCount < number) {
        roomCount += upCount
        upCount += 6
        moveCount += 1
    }

    println(moveCount)
}