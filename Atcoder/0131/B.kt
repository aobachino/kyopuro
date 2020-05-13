fun main(args: Array<String>) {
    // Your code here!
    var (n,l) = readLine()!!.split(" ").map{it.toInt()}
    var list:MutableList<Int> =  mutableListOf()
    var min = 100000000
    
    for(i in 1..n){
        list.add(l + i -1)
    }
    
    for(j in 0..n-1){
        var list2:MutableList<Int> = mutableListOf()
        var sum = 0
        for(k in 0..n-1){
            if(j != k){
                sum += list[k]
                list2.add(Math.abs(list.sum - sum))
            }
        }
        min = Math.min(list.sum - list2[j],min)
    }
    
    println(n)
    println(l)
    println(list)
}
