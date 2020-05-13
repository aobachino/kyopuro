fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var list:MutableList<Pair<Int,Int>> = mutableListOf()
    var preans = 0.0
    var ans = 0.0

    for(i in 1..n){
        var (x,y) = readLine()!!.split(" ").map{it.toInt()}
        list.add(x to y)
    }
    
    for(i in 0..n-1){
        for(j in i+1..n-1){
            var dis = (list[i].first - list[j].first) * (list[i].first - list[j].first) + 
            (list[i].second - list[j].second) * (list[i].second - list[j].second)
            preans += Math.sqrt(dis.toDouble())
        }
    }
    
    ans = (2*preans)/n
    println(ans)
}
