fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toLong()
    val list  = readLine()!!.split(" ").map{it.toLong()}.sorted()
    val arc = n / 2
    val abc = (n / 2) - 1 
    var cnt = list[arc.toInt()] - list[abc.toInt()]
    
    
    print(cnt)
}

