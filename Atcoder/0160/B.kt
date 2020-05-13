fun main(args: Array<String>) {
    // Your code here!
    val FF = 500
    val F = 5
    var x = readLine()!!.toInt()
    var point:Int = 0
    
    point = 1000 * (x / FF) 
    x -= (x / FF) * FF
    
    point += 5 * (x / F)
    println(point)
    
}