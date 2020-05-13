fun main(args: Array<String>) {
    // Your code here!
    var x = readLine()!!.toLong()
    var cnt = 0
    var num = 100L    

    while(num < x){

        num = num + (num * 0.01).toLong()
        
        if(num >= x){
            cnt += 1
            break
        }
        cnt += 1
    }
    
    println(cnt)
}
