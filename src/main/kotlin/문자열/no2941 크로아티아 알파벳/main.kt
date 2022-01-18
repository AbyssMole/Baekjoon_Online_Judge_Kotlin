package 문자열.`no2941 크로아티아 알파벳`

fun main() {
    val croatiaAlphabets = arrayOf("dz=", "z=", "c=", "c-", "lj", "nj", "d-", "s=")
    var inputData = readLine()!!

    for(croatiaAlphabet in croatiaAlphabets) {
        if(inputData.contains(croatiaAlphabet)) {
            inputData = inputData.replace(croatiaAlphabet, " ")
        }
    }

    println(inputData.length)
}