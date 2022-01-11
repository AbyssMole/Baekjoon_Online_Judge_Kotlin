package if문.`no1330 두 수 비교하기`

fun main() {
    val nums = readLine()!!.split(' ')

    when {
        nums[0].toInt() > nums[1].toInt() -> println(">")
        nums[0].toInt() < nums[1].toInt() -> println("<")
        nums[0].toInt() == nums[1].toInt() -> println("==")
    }
}