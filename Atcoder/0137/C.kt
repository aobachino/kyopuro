fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toInt()
    var list = (1..n).map {readLine()!!.toCharArray().sorted()}
    
    println(list.groupBy { it }.map { it.value.size.toLong() }.map { (it - 1) * it / 2 }.fold(0L, Long::plus))
}