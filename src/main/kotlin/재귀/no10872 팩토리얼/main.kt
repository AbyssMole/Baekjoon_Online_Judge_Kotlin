package 재귀.`no10872 팩토리얼`

fun main() {
    val number = readLine()!!.toInt()
    
    println(factorial(number))
}

fun factorial(number : Int) : Int {
    if(number == 0)
        return 1
    else {
        return number * factorial(number - 1)
    }
}