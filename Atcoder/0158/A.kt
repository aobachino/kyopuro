fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!
    var msg = "Yes"
    
    if(s[0] == s[1] && s[0] == s[2]){
        msg = "No"
    }
    println(msg)
    
}
