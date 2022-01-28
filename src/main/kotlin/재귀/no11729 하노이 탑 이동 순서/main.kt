package 재귀.`no11729 하노이 탑 이동 순서`

import kotlin.math.pow

fun main() {
    val stringBuffer = StringBuffer()
    val stringBuilder = StringBuilder(stringBuffer)
    val diskCount = readLine()!!.toInt()
    
    println((2.0.pow(diskCount)).toInt() - 1)
    hanoi(stringBuilder,1, 3, diskCount)
    println(stringBuilder)
}

fun hanoi(stringBuilder : StringBuilder, from : Int, to : Int, diskCount : Int) {
    if(diskCount == 1) {
        stringBuilder.append("$from $to\n")
        return;
    }
    
    hanoi(stringBuilder, from, 6 - from - to, diskCount - 1)
    stringBuilder.append("$from $to\n")
    hanoi(stringBuilder, 6 - from - to, to, diskCount - 1)
}