fun main(args: Array<String>) {
    // Your code here!
    var (a,b,c,d) = readLine()!!.split(" ").map{it.toInt()}
    var msg = "Yes"
    var index = 0
    
    while(a > 0 || c > 0){
        
        if(index == 0){
            c -= b
            index = 2
        }else{
            a -= d
            index = 0
        }
        
        if(a == 0){
            msg = "No"
        }
    }    
    println(msg)
}
