package `기본 수학 2`.`no1085 직사각형에서 탈출`

fun main() {
    val input = readLine()!!.split(' ')
    val x = input[0].toInt()
    val y = input[1].toInt()
    val w = input[2].toInt()
    val h = input[3].toInt()

    var min = 1000

    for(n in 1..input.size) {
        when {
            x < min -> min = x
            y < min -> min = y
            w - x < min -> min = w - x
            h - y < min -> min = h - y
        }
    }

    println(min)
}