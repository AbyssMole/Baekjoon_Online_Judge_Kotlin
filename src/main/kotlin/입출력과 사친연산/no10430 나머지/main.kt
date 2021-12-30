package `입출력과 사친연산`.`no10430 나머지`

fun main() {
    val nums = readLine()!!.split(' ')

    result(nums[0].toString().toInt(), nums[1].toString().toInt(), nums[2].toString().toInt())
}

fun result(A : Int, B : Int, C: Int) {
    println((A + B) % C)
    println(((A % C) + (B % C)) % C)
    println((A * B) % C)
    println(((A % C) * (B % C)) % C)
}