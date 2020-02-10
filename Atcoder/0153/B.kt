fun main(args:Array<String>){
    val (H,N) = readLine()!!.split(" ").map{it.toInt()}
    val sp = readLine()!!.split(" ").map(String::toInt)
    //println(H)
    //println(N)
    //println(sp)
    
    val total = sp.reduce{x,y -> x+y}
    //println(total)
    
    println(if(H<=total) "Yes" else "No")
}