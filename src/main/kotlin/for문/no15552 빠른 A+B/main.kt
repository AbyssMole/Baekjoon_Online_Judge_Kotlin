package for문.`no15552 빠른 A+B`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val count = readLine()!!.toInt()
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    for(n in 1..count) {
        val nums = StringTokenizer(bufferedReader.readLine())
        bufferedWriter.write("${nums.nextToken().toInt() + nums.nextToken().toInt()}")
        bufferedWriter.newLine()
    }
    //bufferedWriter.flush()
    bufferedWriter.close()
}