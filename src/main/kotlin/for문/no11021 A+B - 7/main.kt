package for문.`no11021 A+B - 7`

fun main () {
    val t = readLine()!!.toInt()

    for(n in 1..t) {
        val nums = readLine()!!.split(" ")
        println("Case #$n: ${nums[0].toInt() + nums[1].toInt()}")
    }
}