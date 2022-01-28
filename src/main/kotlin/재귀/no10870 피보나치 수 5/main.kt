package 재귀.`no10870 피보나치 수 5`

fun main() {
    println(fibonacci(readLine()!!.toInt()))
}

fun fibonacci(number: Int) : Int {
    return if(number <= 1)
        number
    else
        fibonacci(number - 1) + fibonacci(number - 2)
}