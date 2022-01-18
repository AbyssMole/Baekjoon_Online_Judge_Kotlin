package 문자열.`no1152 단어의 개수`

fun main() {
    val words = readLine()!!.split(" ")
    var count = 0

    for(string in words) {
        if (string != "") {
            count++
        }
    }

    println(count)
}