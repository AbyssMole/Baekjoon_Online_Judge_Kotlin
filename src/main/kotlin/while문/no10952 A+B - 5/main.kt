package while문.`no10952 A+B - 5`

fun main() {
    while (true) {
        val numbers = readLine()!!.split(" ")

        if(numbers[0] == "0" && numbers[1] == "0")
            break

        println(numbers[0].toInt() + numbers[1].toInt())
    }
}