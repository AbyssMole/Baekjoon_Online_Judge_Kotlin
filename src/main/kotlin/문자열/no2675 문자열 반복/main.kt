package 문자열.`no2675 문자열 반복`

fun main() {
    val count = readLine()!!.toInt()

    for(i in 1..count) {
        println(sequence(readLine()!!.toCharArray()))
    }
}

fun sequence(charArray: CharArray) : String {
    var result = ""

    for(index in 2..charArray.lastIndex) {
        for(count in 1..charArray[0].toString().toInt()) {
            result += charArray[index]
        }
    }

    return result
}