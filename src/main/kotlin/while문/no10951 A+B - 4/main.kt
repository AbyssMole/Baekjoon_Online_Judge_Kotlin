package while문.`no10951 A+B - 4`

fun main() {
    while (true) {
        val line = readLine()

        if(line == null) {
            break
        }

        val numbers = line.split(" ")
        println(numbers[0].toInt() + numbers[1].toInt())
    }
}