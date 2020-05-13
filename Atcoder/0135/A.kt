fun main(args: Array<String>) {
    // Your code here!
    var (a,b) = readLine()!!.split(" ").map{it.toLong()}
    var msg = "IMPOSSIBLE"
    
    if((a+b) % 2 == 0L){
        println((a+b)/2)        
    }else{
        println(msg)   
    }
}
