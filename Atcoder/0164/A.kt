fun main(args: Array<String>) {
    // Your code here!
    var (s,w) = readLine()!!.split(" ").map{it.toInt()}
    var msg = "safe"
    
    if(w >= s){
        msg = "unsafe"
    }
    println(msg)
}
