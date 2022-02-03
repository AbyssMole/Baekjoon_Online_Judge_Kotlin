package `브루트 포스`.`no1436 영화감독 숌`

fun main() {
    val input = readLine()!!
    var count = 0
    var number = 0
    
    while (count < input.toInt()) {
        if(number.toString().contains("666"))
            count++
        
        number++
    }
    
    println(number - 1)
}