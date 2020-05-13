fun main(args: Array<String>) {
    // Your code here!
    var (a,b) = readLine()!!.split(" ").map{it.toInt()}
    
    println(Math.max(a+b,Math.max(a-b,a*b)))
}
