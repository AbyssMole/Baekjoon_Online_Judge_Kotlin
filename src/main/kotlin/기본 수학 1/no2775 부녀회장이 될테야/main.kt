package `기본 수학 1`.`no2775 부녀회장이 될테야`

fun main() {
    val array = Array(15) { IntArray(15) }
    setArray(array)
    val caseCount = readLine()!!.toInt()
    
    
    for(n in 1..caseCount) {
        val floor = readLine()!!.toInt()
        val number = readLine()!!.toInt()
        var count = 0
        
        for(i in 1..number) {
            count += array[floor - 1][i]
        }
        
        println(count)
    }
}

fun setArray(array : Array<IntArray>){
    for(i in 0..14) {
        for(j in 1..14) {
            if(i == 0) {
                array[i][j] = j
            }
            else {
                for(k in 0..j)
                    array[i][j] += array[i - 1][k]
            }
        }
    }
}