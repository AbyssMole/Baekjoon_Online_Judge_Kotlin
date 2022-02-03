package `브루트 포스`.`no2798 블랙잭`

fun main() {
    val input = readLine()!!.split(' ')
    val cardNumber = readLine()!!.split(' ')
    val cardCount = input[0].toInt()
    val m = input[1].toInt()
    var result = 0
    
    for(i in cardCount - 1 downTo 2) {
        for(j in i - 1 downTo 1 ) {
            for(k in j - 1 downTo 0) {
                val sum = cardNumber[i].toInt() + cardNumber[j].toInt() + cardNumber[k].toInt()
                if(sum in (result + 1)..m)
                    result = sum
            }
        }
    }
    
    println(result)
}