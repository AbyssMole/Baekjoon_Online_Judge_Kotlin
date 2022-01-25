package `기본 수학 2`.`no3053 택시 기하학`

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val input = readLine()!!.toDouble()
    var euclidean = 0.0
    var taxi = 0.0
    
    euclidean = input.pow(2) * Math.PI
    taxi = sqrt((input.pow(2)) * 2).pow(2)
    
    println(euclidean)
    println(taxi)
}