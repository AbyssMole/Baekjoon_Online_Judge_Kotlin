package 문자열.`no10809 알파벳 찾기`

fun main() {
    val charArray = readLine()!!.toCharArray()
    val saveArray = IntArray(26){-1}

    for((index, c) in charArray.withIndex()) {
        if(saveArray[c.code - 97] == -1)
            saveArray[c.code - 97] = index
    }

    for(result in saveArray)
        print("$result  ")
}