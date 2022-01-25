package `기본 수학 2`.`no4948 베르트랑 공준`

import kotlin.math.sqrt

fun main() {
    while (true) {
        val min = readLine()!!.toInt()
        
        if(min == 0) {
            break
        }
        
        val max = min * 2
        val numberArray = BooleanArray(max + 1){true}
        val primeNumbers = sqrt(max.toDouble()).toInt()
        var count = 0
        
        for(index in 2..primeNumbers) {
            if(numberArray[index]) {
                for(i in (index * index)..numberArray.lastIndex step index) {
                    numberArray[i] = false
                }
            }
        }
        
        for(i in min + 1..numberArray.lastIndex)
            if(numberArray[i])
                count++
        
        println(count)
    }
}