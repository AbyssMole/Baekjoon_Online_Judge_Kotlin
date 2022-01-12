package `1차원 배열`.`no4344 평균은 넘겠지`

fun main() {
    val count = readLine()!!.toInt()

    for(i in 1..count) {
        val line = readLine()!!.split(' ')
        val s_count = line[0].toInt()
        val scoreArray = arrayListOf<Float>()
        var average = 0f
        var overCount = 0f

        for(index in 1..line.lastIndex)
            scoreArray.add(line[index].toFloat())

        for(score in scoreArray)
            average += score

        average /= s_count

        for(score in scoreArray)
            if(score > average)
                overCount++

        println("%.3f".format((overCount / s_count) * 100f) + "%")
    }
}