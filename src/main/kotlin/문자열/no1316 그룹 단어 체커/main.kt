package 문자열.`no1316 그룹 단어 체커`

fun main() {
    val caseNumber = readLine()!!.toInt()
    var count = 0

    for (n in 1..caseNumber) {
        val word = readLine()!!
        val charArray = word.toCharArray().distinct()
        var isGroup = true

        for(char in charArray) {
            if(word.split("$char{1,}".toRegex()).size > 2) {
                isGroup = false
                break
            }
        }

        if(isGroup)
            count++
    }

    println(count)
}