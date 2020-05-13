fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var index = readLine()!!.split(" ").map{it.toInt()}
    var list:MutableList<Int> = mutableListOf()
    var ans:MutableList<Int> = mutableListOf()
    
    for(i in 0..n-1){
        list.add(i+1)
        ans.add(0)
    }
    
    for(i in 0..n-1){
        ans[index[i]-1] = list[i] 
    }
    ans.forEach{print("${it} ")}
}
