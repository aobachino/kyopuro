fun main(args: Array<String>) {
    // Your code here!
    val (a,b,c) = readLine()!!.split(" ").map{it.toInt()}
    var ans = (a-b) - c
    
    if(ans > 0){
        ans = 0
    }
    println(Math.abs(ans))
}
