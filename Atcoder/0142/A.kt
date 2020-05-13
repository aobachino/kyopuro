fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var list:MutableList<Int> = mutableListOf()
    var ans = 0.0
    
    for(i in 1..n){
        list.add(i)
    }
    
    ans = list.filter{it % 2 != 0}.count().toDouble() / n.toDouble()
    println(ans)
}
