package if문.`no9498 시험 성적`

fun main() {
    val score = readLine()!!.toString().toInt()

    when {
        score > 89 -> println("A")
        score > 79 -> println("B")
        score > 69 -> println("C")
        score > 59 -> println("D")
        else -> println("F")
    }
}