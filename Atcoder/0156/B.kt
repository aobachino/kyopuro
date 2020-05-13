fun main(args: Array<String>) {
    // Your code here!
    var (n,k) = readLine()!!.split(" ").map{it.toLong()}
    var calc:Long = 0
    var res:String = ""
    
    
    while(n >= k){
        calc = n%k
        res = res + calc.toString()
        n = n/k
    }
    res = res + n.toString()
    println(res.length)
}
