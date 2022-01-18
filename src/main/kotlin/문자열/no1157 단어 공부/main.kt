package 문자열.`no1157 단어 공부`

fun main() {
    val charArray = readLine()!!.uppercase().toCharArray()
    val countArray = IntArray(26){0}
    var maxCount = 0
    var maxChar = ' '
    var isDuplicate = false

    for(char in charArray) {
        countArray[char.code - 65] += 1
    }

    for((index, count) in countArray.withIndex()) {
        if(count > maxCount) {
            maxCount = count
            maxChar = (index + 65).toChar()
            isDuplicate = false
        }
        else if(count == maxCount) {
            isDuplicate = true
        }
    }

    if(isDuplicate)
        println("?")
    else
        println(maxChar)
}