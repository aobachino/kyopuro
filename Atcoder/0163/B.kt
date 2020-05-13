fun main(args: Array<String>) {
    // Your code here!
    var (n,m) = readLine()!!.split(" ").map{it.toLong()}
    var list = readLine()!!.split(" ").map{it.toLong()}
    var ans = n - list.sum()
    
    if(ans < 0){
        ans = -1
    }
    
    println(ans)
}
