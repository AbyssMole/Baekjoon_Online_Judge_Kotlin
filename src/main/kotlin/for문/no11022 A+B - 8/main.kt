package for문.`no11022 A+B - 8`

fun main () {
    val t = readLine()!!.toInt()

    for(n in 1..t) {
        val nums = readLine()!!.split(" ")
        val n1 = nums[0].toInt()
        val n2 = nums[1].toInt()
        println("Case #$n: $n1 + $n2 = ${n1 + n2}")
    }
}