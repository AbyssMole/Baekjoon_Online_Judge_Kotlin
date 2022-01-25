package `기본 수학 2`.`no1978 소수 찾기`

fun main() {
    val count = readLine()!!.toInt()
    val numbers = readLine()!!.split(' ')
    var result = 0
    
    for(c in 0 until count) {
        var zeroCount = 0
        for(n in 1..numbers[c].toInt()) {
            if(numbers[c].toInt() % n == 0)
                zeroCount++
        }
        
        if(zeroCount == 2) {
            result++
        }
    }
    
    println(result)
}