package `기본 수학 2`.`no1929 소수 구하기`

import kotlin.math.sqrt

fun main() {
    val numbers = readLine()!!.split(' ')
    val min = numbers[0].toInt()
    val max = numbers[1].toInt()
    val numberArray = BooleanArray(max + 1){true}
    val primeNumbers = sqrt(max.toDouble()).toInt()
    
    for(index in 1..primeNumbers) {
        if(index == 1) {
            numberArray[index] = false
            continue
        }
        
        if(numberArray[index]) {
            for(i in (index * index)..numberArray.lastIndex step index) {
                numberArray[i] = false
            }
        }
    }
    
    for(i in min..numberArray.lastIndex)
        if(numberArray[i])
            println(i)
}