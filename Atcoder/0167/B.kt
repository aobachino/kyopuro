fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!.split(" ").map{it.toLong()}
    var k = s[3]
    var cnt = 0L
    
    if((s[0]+s[1]+s[2]) == k){
        print(s[0] -(s[2]))
    }else if((s[0] + s[1] + s[2]) > k){
        print(s[0] - (s[2]-s[1]))
    }else{
    }
}
