fun main(args: Array<String>) {
    // Your code here!
    val list = readLine()!!.toList().groupBy{it}.map{it.value.size}
    var msg = "No"
    
    if(list.size == 2){
        if(list[0] == 2 && list[1] == 2){
            msg = "Yes"
        }
    }
    print(msg)
}
