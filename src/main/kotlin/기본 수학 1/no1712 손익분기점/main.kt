package `기본 수학 1`.`no1712 손익분기점`

fun main() {
    val inputArray = readLine()!!.split(' ')
    val fixedCost = inputArray[0].toInt()
    val cost = inputArray[1].toInt()
    val price = inputArray[2].toInt()

    if(cost >= price) {
        println(-1)
    }
    else {
        val result = fixedCost / (price - cost)
        println(result + 1)
    }
}