fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!
    var t = readLine()!!
    var msg = "No"
    
    if(s == t.substring(0,s.length) && t.length == s.length + 1){
        msg = "Yes"
    }
    println(msg)
}
