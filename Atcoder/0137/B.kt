fun main(args: Array<String>) {
    // Your code here!
    val (k,x) = readLine()!!.split(" ").map{it.toInt()}
    val max = 1000000
    val min = -1000000
    var sta = Math.max(x-(k-1),-1000000)
    var fin = Math.min(x+(k-1),1000000)
    
    for(i in sta..fin){
        print(i)
        print(" ")
    }
}
