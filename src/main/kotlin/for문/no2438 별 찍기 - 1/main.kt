package for문.`no2438 별 찍기 - 1`

fun main () {
    val number = readLine()!!.toInt()

    for (row in 1..number) {
        for(colum in 1..row) {
            print("*")
        }
        println()
    }
}