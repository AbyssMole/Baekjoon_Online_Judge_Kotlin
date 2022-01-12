package for문.`no2439 별 찍기 - 2`

fun main() {
    val number = readLine()!!.toInt()

    for(row in 1..number) {
        for(blink in number downTo row + 1)
            print(" ")

        for(star in 1..row)
            print("*")

        println()
    }
}