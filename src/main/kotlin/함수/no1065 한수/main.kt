package 함수.`no1065 한수`

fun main() {
    val number = readLine()!!.toInt()
    var count = 0

    for (n in 1..number) {
        if(hansu(n))
            count++
    }

    println(count)
}

fun hansu(number: Int) : Boolean{
    val numberArray = number.toString().toCharArray()
    var isHansu = true

    when {
        numberArray.size > 2 -> {
            var differenceValue = 0

            for(i in 0 until numberArray.lastIndex) {
                if (i == 0) {
                    differenceValue = numberArray[i] - numberArray[i + 1]
                }
                else {
                    if(differenceValue != numberArray[i] - numberArray[i + 1])
                        isHansu = false
                }
            }
        }
        else -> {
            isHansu = true
        }
    }

    return isHansu
}