package `브루트 포스`.`no1018 체스판 다시 칠하기`

fun main() {
    val exampleArray = arrayOf(
        arrayOf("BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB"),
        arrayOf("WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW")
    )
    
    val input = readLine()!!.split(' ')
    val maxRow = input[0].toInt()
    val maxColumn = input[1].toInt()
    val chessboard = Array(maxRow){""}
    var result = 64
    
    for(i in 0 until maxRow)
        chessboard[i] = readLine()!!
    
    for(ex in 0..1) {
        for(i in 0..maxRow - 8) {
            for(j in 0..maxColumn - 8) {
                var reCount = 0
                for(row in 0 until 8) {
                    for(column in 0 until 8) {
                        if(chessboard[row + i][column + j] != exampleArray[ex][row][column]) {
                            reCount++
                        }
                    }
                }
            
                result = if(reCount < result) reCount else result
            }
        }
    }
    
    
    println(result)
}