fun main(args: Array<String>) {
    // Your code here!
    var k = readLine()!!.toInt()
    var (a,b) = readLine()!!.split(" ").map{it.toInt()}
    var msg = "NG"
    
    for(i in a..b){
        
        if(i % k == 0){
            msg = "OK"
            break
        }
    }
    
    println(msg)
}
