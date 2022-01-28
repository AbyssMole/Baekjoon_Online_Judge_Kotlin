package 재귀.`no2447 별 찍기 - 10`

fun main() {
    val number = readLine()!!.toInt()
    val patternArray = Array(number){ Array(number){" "} }
    val stringBuffer = StringBuffer()
    val stringBuilder = StringBuilder(stringBuffer)
    
    patternPrint(patternArray, 0, 0, number)
    
    for(i in 0 until number) {
        for(j in 0 until number) {
            stringBuilder.append(patternArray[i][j])
        }
        stringBuilder.append("\n")
    }
    
    println(stringBuilder)
}

fun patternPrint(patternArray : Array<Array<String>>, row : Int, column : Int, number : Int) {
    if(number == 3) {
        for(i in row until row + number) {
            for(j in column until column + number) {
                if(i == row + (number / 3) && j == column + (number / 3)) {
                    continue
                }
                
                patternArray[i][j] = "*"
            }
        }
    }
    else {
        for(i in row until row + number step number / 3) {
            for(j in column until column + number step number / 3) {
                if(i == row + (number / 3) && j == column + (number / 3)) {
                    continue
                }
                patternPrint(patternArray, i, j, number / 3)
            }
        }
    }
}

//012345678901234567890123456   //012345678   //012
//*************************** 0 //********* 0 //*** 0
//* ** ** ** ** ** ** ** ** * 1 //* ** ** * 1 //* * 1
//*************************** 2 //********* 2 //*** 2
//***   ******   ******   *** 3 //***   *** 3
//* *   * ** *   * ** *   * * 4 //* *   * * 4
//***   ******   ******   *** 5 //***   *** 5
//*************************** 6 //********* 6
//* ** ** ** ** ** ** ** ** * 7 //* ** ** * 7
//*************************** 8 //********* 8
//*********         ********* 9
//* ** ** *         * ** ** * 0
//*********         ********* 1
//***   ***         ***   *** 2
//* *   * *         * *   * * 3
//***   ***         ***   *** 4
//*********         ********* 5
//* ** ** *         * ** ** * 6
//*********         ********* 7
//*************************** 8
//* ** ** ** ** ** ** ** ** * 9
//*************************** 0
//***   ******   ******   *** 1
//* *   * ** *   * ** *   * * 2
//***   ******   ******   *** 3
//*************************** 4
//* ** ** ** ** ** ** ** ** * 5
//*************************** 6