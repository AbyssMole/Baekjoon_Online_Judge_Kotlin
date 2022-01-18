package 문자열.`no2908 상수`

fun main() {
    val numbers = readLine()!!.split(" ")
    val reversNumber1 = numbers[0].reversed()
    val reversNumber2 = numbers[1].reversed()

    if(reversNumber1.toInt() > reversNumber2.toInt()) {
        println(reversNumber1)
    }
    else {
        println(reversNumber2)
    }
}