package `1차원 배열`.`no1546 평균`

fun main() {
    val count = readLine()!!.toInt()
    val scores = readLine()!!.split(' ')
    val floatScores = arrayListOf<Float>()
    var maxScore = 0f
    var result = 0f

    for(i in 0 until count)
        floatScores.add(scores[i].toFloat())

    maxScore = floatScores.maxOrNull()!!

    for(i in 0 until count)
        floatScores[i] = (floatScores[i] / maxScore) * 100

    for(i in 0 until count)
        result += floatScores[i]

    println(result / count)
}