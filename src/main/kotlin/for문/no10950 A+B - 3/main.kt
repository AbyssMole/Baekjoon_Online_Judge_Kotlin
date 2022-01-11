package for문.`no10950 A+B - 3`

fun main() {
    val count = readLine()!!.toInt()

    for (n in 1..count) {
        val nums = readLine()!!.split(' ')
        println("${nums[0].toInt() + nums[1].toInt()}")
    }
}