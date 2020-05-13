fun main(args: Array<String>) {
    // Your code here!
    var (k,x) = readLine()!!.split(" ").map{it.toLong()}
    var msg = "Yes"
    var fy = 500L * k
    
    if(fy < x){
        msg = "No"
    }
    println(msg)
}
