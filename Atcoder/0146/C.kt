fun main(args: Array<String>) {
    // Your code here!
    func()
}

fun func(){
    var (a,b,x) = readLine()!!.split(" ").map{it.toLong()}
    
    fun calc(n:Long):Long{
        return a * n + b * n.toString().length
    }
    
    fun ans(m:Long):Long{
        var ok = 0L
        var ng = 1000000001L
        while(Math.abs(ok-ng) >1){
            var mid = (ok+ng)/2L
            if(calc(mid) <= m) ok = mid else ng = mid
        }
        return ok
    }
    
    print(ans(x))
}
