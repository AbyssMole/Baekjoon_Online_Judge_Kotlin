package `기본 수학 2`.`no9020 골드바흐의 추측`

import kotlin.math.sqrt

fun main() {
    val count = readLine()!!.toInt()
    
    for (n in 1..count) {
        val number = readLine()!!.toInt()
        var min = number / 2
        var max = number / 2
        
        val numberArray = BooleanArray(number + 1){true}
        val primeNumbers = sqrt(number.toDouble()).toInt()
        
        for(index in 2..primeNumbers) {
            if(numberArray[index]) {
                for(i in (index * index)..numberArray.lastIndex step index) {
                    numberArray[i] = false
                }
            }
        }
        
        while (true) {
            if(numberArray[min] && numberArray[max]) {
                println("$min $max")
                break
            }
            
            min--
            max++
        }
    }
}