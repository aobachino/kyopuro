fun main(args: Array<String>) {
    // Your code here!
    var (a,b,c) = readLine()!!.split(" ").map{it.toInt()}
    var msg = "Yes"
    
    if((a == c && a == b) || (a != c && a != b && c != b)){
        msg = "No"
    }
    println(msg)
}
