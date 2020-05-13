fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var s = readLine()!!
    var msg = "No"
    
    if(n % 2 == 0){
        for(i in 0..n/2){
            val buil = StringBuilder()
            buil.append(s.substring(0,i)).append(s.substring(0,i))
            if(buil.toString() == s){
                msg = "Yes"
            }
        }
    }
    print(msg)
}
