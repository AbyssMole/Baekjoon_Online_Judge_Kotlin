package `기본 수학 1`.`no2869 달팽이는 올라가고 싶다`

fun main() {
    val numbers = readLine()!!.split(' ')
    val high = numbers[2].toInt()
    val dayMove = numbers[0].toInt()
    val nightMove = numbers[1].toInt()
    val dailyMove = dayMove - nightMove
    val restDistance = high - dayMove
    var dayCount = 1

    dayCount += (restDistance / dailyMove)

    if(restDistance % dailyMove > 0) {
        dayCount++
    }
    
    println(dayCount)
}