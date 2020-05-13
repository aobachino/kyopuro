fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!.toMutableList()
    var cnt = 0
    var sr = s.reversed()
    
    for(i in 0..s.size-1){
        sr = s.reversed()
        if(s == sr){
            break
        }else{
            if(s[i] == sr[i]){
                continue
            }
            s[i] = sr[i]
            cnt += 1
        }
    }
    println(cnt)
}
