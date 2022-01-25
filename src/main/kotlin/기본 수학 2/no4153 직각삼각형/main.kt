package `기본 수학 2`.`no4153 직각삼각형`

import kotlin.math.pow

fun main() {
    while (true) {
        val input = readLine()!!.split(' ')
        val intArray = intArrayOf(0,0,0)
        if(input[0] == "0")
            break
        
        for(i in 0 until 3) {
            intArray[i] = input[i].toInt()
        }
        
        intArray.sort()
        
        val width = intArray[0].toDouble()
        val height = intArray[1].toDouble()
        val hypotenuse = intArray[2].toDouble()
        
        if((width.pow(2) + height.pow(2)) == hypotenuse.pow(2))
            println("right")
        else
            println("wrong")
    }
}