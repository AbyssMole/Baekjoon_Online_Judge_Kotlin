package `브루트 포스`.`no2231 분해합`

fun main() {
    val input = readLine()!!.toInt()
    var result = 0
    for(number in 0..input) {
        val numberArray = number.toString()
        var sum = number
        
        for(i in 0..numberArray.lastIndex) {
            sum = (sum + numberArray[i].toString().toInt())
        }
        
        if(sum == input) {
            result = number
            break
        }
        else {
            result = 0
        }
    }
    
    println(result)
}