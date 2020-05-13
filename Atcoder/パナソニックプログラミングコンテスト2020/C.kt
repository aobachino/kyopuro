fun main(args: Array<String>) {
    // Your code here!
    val (a,b,c) = readLine()!!.split(" ").map{it.toLong()}
    var msg = "No"
    val d = c-a-b
    
    
    if(d > 0 && 4*a*b < d*d){
        msg = "Yes"
    }
    println(msg)
}