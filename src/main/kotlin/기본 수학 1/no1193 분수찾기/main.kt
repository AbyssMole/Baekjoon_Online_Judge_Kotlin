package `기본 수학 1`.`no1193 분수찾기`

fun main() {
    var number = readLine()!!.toInt()
    var count = 0
    
    while (count < number) {
        number -= count
        count++
    }
    
    if (count % 2 == 0) {
        println("${number}/${count - number + 1}")
    }
    else {
        println("${count - number + 1}/${number}")
    }
}