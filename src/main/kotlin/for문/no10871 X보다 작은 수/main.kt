package for문.`no10871 X보다 작은 수`

fun main() {
    val case = readLine()!!.split(" ")
    val numbers = readLine()!!.split(" ")

    for (i in numbers.indices)
        if(numbers[i].toInt() < case[1].toInt())
            print("${numbers[i]} ")
}