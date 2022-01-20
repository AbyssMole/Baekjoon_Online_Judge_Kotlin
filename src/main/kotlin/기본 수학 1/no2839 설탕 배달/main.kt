package `기본 수학 1`.`no2839 설탕 배달`

fun main() {
    var kg = readLine()!!.toInt()
    var count = 0
    
    while (kg > 0) {
        when {
            kg % 5 == 0 -> {
                kg -= 5
                count++
            }
            kg % 3 == 0 -> {
                kg -= 3
                count++
            }
            kg > 5 -> {
                kg = kg - 5
                count++
            }
            kg > 3 -> {
                kg = kg - 3
                count++
            }
            else -> {
                break
            }
        }
    }
    
    if(kg != 0) {
        println(-1)
    }
    else {
        println(count)
    }
}