fun main(args: Array<String>) {
    // Your code here!
    var a = readLine()!!.split(" ").map{it.toInt()}
    var msg = "bust"
    
    if(a.sum() <= 21){
        msg = "win"
    }
    println(msg)
}
