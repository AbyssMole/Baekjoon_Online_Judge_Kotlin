package `기본 수학 2`.`no11653 소인수분해`

fun main() {
    var number = readLine()!!.toInt()
    
    while (number != 1) {
        for(n in 2..number) {
            if(number % n == 0) {
                println(n)
                number /= n
                break
            }
        }
    }
}