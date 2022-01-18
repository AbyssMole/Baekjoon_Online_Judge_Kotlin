package 문자열.`no11720 숫자의 합`

fun main() {
    val count = readLine()!!.toInt()
    val charArray = readLine()!!.toCharArray()
    var result = 0;

    for(n in charArray)
        result += n.toString().toInt()

    println(result)
}