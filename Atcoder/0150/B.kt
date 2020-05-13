fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var s = readLine()!!
    var cnt = 0
    var str = s.replace("ABC",",")!!
    
    if(s != str){
        for(i in 0..str.length-1){
            if(str[i].toString() == ","){
                cnt += 1 
            } 
        }
    }
    println(cnt)
}
