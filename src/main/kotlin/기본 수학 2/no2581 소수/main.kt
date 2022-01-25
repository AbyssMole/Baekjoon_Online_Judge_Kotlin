package `기본 수학 2`.`no2581 소수`

fun main() {
    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()
    var sum = 0
    var resultMin = max
    
    for(n in min..max) {
        var count = 0
        
        for(s in 1..n) {
            if(n % s == 0)
                count++
        }
        
        if(count == 2) {
            sum += n
    
            if(resultMin > n) {
                resultMin = n
            }
        }
    }
    
    if(sum > 0) {
        println(sum)
        println(resultMin)
    }
    else {
        println(-1)
    }
}