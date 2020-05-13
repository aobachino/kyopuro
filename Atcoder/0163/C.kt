fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map{it.toInt()}.sorted()
    var cnt = 0
    var index = 1
    
    for(i in 1..n){
        cnt = 0
        for(j in index-1..list.size-1){
            if(i != list[j]){
                break
            }
            cnt += 1
            index += 1
        }
        println(cnt)         
    }
}
