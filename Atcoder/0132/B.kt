fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toInt()
    val list  = readLine()!!.split(" ").map{it.toInt()}
    var cnt = 0
    
    for(i in 1..n-2){
        var min = mutableListOf(list[i-1],list[i],list[i+1]).sorted()
        if(min[1] == list[i]){
            cnt += 1
        }
    }
    print(cnt)
}
