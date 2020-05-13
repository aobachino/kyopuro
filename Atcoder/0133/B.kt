fun main(args: Array<String>) {
    // Your code here!
    var (n,d) = readLine()!!.split(" ").map{it.toInt()}
    var list:List<List<Int>> = (1..n).map{readLine()!!.split(" ").map{it.toInt()}}
    var list2:MutableList<Double> = mutableListOf() 
    var cnt = 0
    
    for(i in 0..n-1){
        for(k in i+1..n-1){
            var preans = 0
            for(j in 0..d-1){
                preans += (list[i][j] - list[k][j]) * (list[i][j] - list[k][j])
            }
            list2.add(Math.sqrt(preans.toDouble()))
        }
    }
    
    for(l in 0..list2.size-1){
        var intNum:Int = list2[l].toInt()
        var doubleNum:Double = list2[l] - intNum.toDouble()
        
        if(doubleNum == 0.0){
            cnt += 1
        }
    }
    println(cnt)
}
