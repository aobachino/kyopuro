fun main(args: Array<String>) {
    // Your code here!
    var (n,m) = readLine()!!.split(" ").map{it.toInt()}
    var msg = "No"
    

    if(n == m){
        msg = "Yes"
    }
    
    print(msg)    
}
