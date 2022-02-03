package `브루트 포스`.`no7568 덩치`

fun main() {
    val count = readLine()!!.toInt()
    val inputArray = Array(count){Array(2){0} }
    val resultArray = Array(count){1}
    
    for(i in 0 until count) {
        val input = readLine()!!.split(' ')
        for(j in  0..1) {
            inputArray[i][j] = input[j].toInt()
        }
    }
    
    for(i in 0 until count) {
        for(j in 0 until count) {
            if(i == j) {
                continue
            }
            
            if(inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1]) {
                resultArray[i]++
            }
        }
    }
    
    for(i in 0 until count) {
        print("${resultArray[i]} ")
    }
}