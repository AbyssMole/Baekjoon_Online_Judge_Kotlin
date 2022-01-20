package `기본 수학 1`.`no1011 Fly me to the Alpha Centauri`

import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val testCase = readLine()!!.toInt()
    
    for(case in 1..testCase) {
        val inputData = readLine()!!.split(' ')
        val distance = inputData[1].toDouble() - inputData[0].toDouble()
        val maxMovement = sqrt(distance).roundToInt()
        
        if(distance <= maxMovement.toDouble().pow(2)) {
            println((maxMovement * 2) - 1)
        }
        else {
            println(maxMovement * 2)
        }
    }
}