package `기본 수학 1`.`no10757 큰 수 A+B`

fun main() {
    val numbers = readLine()!!.split(' ')
    
    println(numbers[0].toBigInteger() + numbers[1].toBigInteger())
}