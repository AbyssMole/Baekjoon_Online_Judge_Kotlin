package if문.`no2884 알람 시계`

fun main() {
    val hourAndMin = readLine()!!.split(' ')
    var hour = hourAndMin[0].toInt()
    var min = hourAndMin[1].toInt()

    min -= 45

    if(min < 0) {
        min += 60
        hour -= 1
    }

    if(hour < 0)
        hour += 24

    println("$hour $min")
}