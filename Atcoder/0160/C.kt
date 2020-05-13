fun main(args: Array<String>) {
    // Your code here!
    val (K,N) = readLine()!!.split(" ").map{it.toInt()}
    val mList = readLine()!!.split(" ").map{it.toInt()}
    
    var ans = mList[N-1] - mList[0]
    for(i in 1 until N){
        ans = Math.min(ans, K - mList[i] + mList[i-1])
    }
    
    println(ans)
}
