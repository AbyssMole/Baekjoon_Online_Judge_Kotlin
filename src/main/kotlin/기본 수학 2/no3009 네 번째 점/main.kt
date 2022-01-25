package `기본 수학 2`.`no3009 네 번째 점`

fun main() {
    val arrayX = arrayListOf<Int>()
    val arrayY = arrayListOf<Int>()
    
    for(n in 1..3) {
        val point = readLine()!!.split(' ')
        if(!arrayX.contains(point[0].toInt())) arrayX.add(point[0].toInt()) else arrayX.remove(point[0].toInt())
        if(!arrayY.contains(point[1].toInt())) arrayY.add(point[1].toInt()) else arrayY.remove(point[1].toInt())
    }
    
    println("${arrayX[0]} ${arrayY[0]}")
}