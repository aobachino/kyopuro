fun main(args: Array<String>) {
    // Your code here!
    var (x,l,r) = readLine()!!.split(" ").map{it.toInt()}
    
    while(x < l || x > r){
        if(x < l){
            x += 1
        }else{
            x -= 1
        }
    }
    
    println(x)
}
