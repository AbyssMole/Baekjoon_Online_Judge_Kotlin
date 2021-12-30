package `입출력과 사친연산`.`no10869 사칙연산`

fun main() {
    val nums = readLine()!!.split(' ')

    println(nums[0].toString().toInt() + nums[1].toString().toInt())
    println(nums[0].toString().toInt() - nums[1].toString().toInt())
    println(nums[0].toString().toInt() * nums[1].toString().toInt())
    println(nums[0].toString().toInt() / nums[1].toString().toInt())
    println(nums[0].toString().toInt() % nums[1].toString().toInt())
}