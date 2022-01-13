package 함수.`no4673 셀프 넘버`

fun main() {
    val isSelfNumberArray = BooleanArray(10001){true}

    selfNumber(isSelfNumberArray)

    for(value in 1..10000)
        if(isSelfNumberArray[value])
            println(value)
}

fun selfNumber(list : BooleanArray) {
    for(i in 1..10000) {
        val arrayNumber = i.toString().toCharArray()
        var result = 0;

        for(n in arrayNumber)
            result += n.toString().toInt()

        result += i;
        if(result <= 10000)
            list[result] = false
    }
}