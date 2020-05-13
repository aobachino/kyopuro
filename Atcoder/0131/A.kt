fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!.toList()
    var msg = "Good"
    
    for(i in 1..s.size-1){
        if(s[i-1] == s[i]){
            msg = "Bad"
            break
        }
    }

    println(msg)
}
