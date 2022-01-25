package `기본 수학 2`.`no1002 터렛`

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val caseCount = readLine()!!.toInt()
    
    for(i in 1..caseCount) {
        val input = readLine()!!.split(' ')
        val turret1 = arrayOf(input[0].toDouble(), input[1].toDouble())
        val distance1 = input[2].toDouble()
        val turret2 = arrayOf(input[3].toDouble(), input[4].toDouble())
        val distance2 = input[5].toDouble()
        val turretDistance = sqrt((turret1[0] - turret2[0]).pow(2) + (turret1[1] - turret2[1]).pow(2))
        
        if(turretDistance == 0.0) {
            if(distance1 == distance2) {
                println(-1)
            }
            else {
                println(0)
            }
        }
        else {
            if(turretDistance < distance1 + distance2) {
                if(turretDistance > abs(distance1 - distance2))
                    println(2)
                else if(turretDistance == abs(distance1 - distance2))
                    println(1)
                else
                    println(0)
            }
            else if(turretDistance == distance1 + distance2)
                println(1)
            else
                println(0)
        }
    }
}