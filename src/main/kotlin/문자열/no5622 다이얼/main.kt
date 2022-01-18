package 문자열.`no5622 다이얼`

fun main() {
    val dialNumbers = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    val inputNumbers = readLine()!!.toCharArray()
    var time = 0

    for(char in inputNumbers) {
        for((index, dialNumber) in dialNumbers.withIndex()) {
            if(dialNumber.contains(char)) {
                time += index + 3
                break
            }
        }
    }

    println(time)
}