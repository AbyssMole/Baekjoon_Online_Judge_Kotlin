package `1차원 배열`.`no2577 숫자의 개수`

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val numberArray = arrayListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    val multiply = number1 * number2 * number3
    val result = multiply.toString().toCharArray()

    for(i in result)
        numberArray[i.toString().toInt()]++

    for(i in numberArray)
        println(i)
}