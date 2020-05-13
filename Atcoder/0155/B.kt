fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var numList = readLine()!!.split(" ").map{it.toInt()}
    numList.forEach {
        if (it % 2 == 0 && it % 3 != 0 && it % 5 != 0) {
            println("DENIED")
            return
        }
    }
    println("APPROVED") 
}