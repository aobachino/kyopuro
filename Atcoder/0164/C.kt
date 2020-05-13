fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var list = (1..n).map{readLine()!!}.sorted()
    var index = 0
    
    println(list.groupBy{it}.size)
}
