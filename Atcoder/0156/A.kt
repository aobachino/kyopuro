fun main(args: Array<String>) {
    // Your code here!
    var (n,k) = readLine()!!.split(" ").map{it.toInt()}

    if(n < 10){
        k += (100 * (10-n))
    }
    println(k)
}
