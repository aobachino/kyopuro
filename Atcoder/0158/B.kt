fun main(args: Array<String>) {
    // Your code here!
    val (s,b,r) = readLine()!!.split(" ").map{it.toLong()}
    val all = b + r
    val sub = s % all
    val div = s / all
    var blue = div * b
    
    var x:Long = 0
    if(sub > b){
        x = b
    }else{
        x = sub
    }
    
    blue += x
    
    println(blue)

}
