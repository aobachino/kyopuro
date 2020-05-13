fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toDouble()
    var list = readLine()!!.split(" ").map{it.toDouble()}
    
    
    if(n == 2.0 || list.filter{it == list[0]}.count().toDouble() == n){
        println(list.sum() / n)
    }else{
        val answer = list.sorted().reduce { acc, i -> (acc + i) / 2 }
        println(answer)
    }
}
