fun main(args: Array<String>) {
    // Your code here!
    var (n,k) = readLine()!!.split(" ").map{it.toInt()}
    var list = readLine()!!.split(" ").map{it.toInt()}
    var ans = 0
    
    ans = list.filter{it >= k}.count()
    println(ans)
}
