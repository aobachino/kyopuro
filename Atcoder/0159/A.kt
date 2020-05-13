fun main(args: Array<String>) {
    // Your code here!
    var (n,m) = readLine()!!.split(" ").map{it.toInt()}
    
    println(fact(n) + fact(m))
    
}

fun fact(num:Int):Int{
    var ans = 1
    var iNum = num
    var iPi = 2
    
    while(iPi >= 1){
        ans *= iNum
        
        iNum -= 1
        iPi -=1
    }
    
    return ans / 2
}
