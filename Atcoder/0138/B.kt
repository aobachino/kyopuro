fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toDouble()
    var list = readLine()!!.split(" ").map{1.0 / it.toDouble()}
    
    println(1.0/list.sum())
}
