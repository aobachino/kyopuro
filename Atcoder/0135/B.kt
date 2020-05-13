fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map{it.toInt()}
    var aslist = list.sorted()
    var msg = "YES"
    var cnt = 0
    var index = 1
    
    if(list != aslist){
        for(i in 0..list.size-1){
            if(index != list[i]){
                cnt += 1
            }
            index += 1
        }
    
        if(cnt/2 >= 2){
            msg = "NO"     
        }
    }
   
    print(msg)
}
