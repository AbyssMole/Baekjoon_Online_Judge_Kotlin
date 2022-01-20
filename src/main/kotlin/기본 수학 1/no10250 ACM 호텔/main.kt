package `기본 수학 1`.`no10250 ACM 호텔`

fun main() {
    val caseCount = readLine()!!.toInt()
    
    for(n in 1..caseCount) {
        val inputData = readLine()!!.split(' ')
        val high = inputData[0].toInt()
        val width = inputData[1].toInt()
        val order = inputData[2].toInt()
    
        val floor = if(order % high != 0) order % high else high
        val number = if(order % high != 0) order / high + 1 else order / high
    
        println(floor.toString() + String.format("%02d", number))
    }
}