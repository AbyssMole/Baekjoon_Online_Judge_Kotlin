package `1차원 배열`.`no8958 OX퀴즈`

fun main() {
    val count = readLine()!!.toInt()
    var score = 1
    var result = 0
    for(i in 1..count) {
        val oxList = readLine()!!.toCharArray()

        for(case in oxList) {
            when (case) {
                'O' -> {
                    result += score
                    score += 1
                }
                'X' -> {
                    score = 1
                }
            }
        }

        println(result)
        result = 0
        score = 1
    }
}