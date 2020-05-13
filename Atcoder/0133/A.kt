fun main(args: Array<String>) {
    // Your code here!
    var (n,a,b) = readLine()!!.split(" ").map{it.toInt()}
    
    print(Math.min(n*a,b))
}
