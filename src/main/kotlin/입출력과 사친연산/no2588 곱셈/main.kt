package `입출력과 사친연산`.`no2588 곱셈`

fun main() {
    val num1 = readLine()!!
    val num2 = readLine()!!

    println(num1.toInt() * num2[2].toString().toInt())
    println(num1.toInt() * num2[1].toString().toInt())
    println(num1.toInt() * num2[0].toString().toInt())
    println(num1.toInt() * num2.toInt())
}