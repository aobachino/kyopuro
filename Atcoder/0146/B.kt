fun main(args: Array<String>) {
    // Your code here!
    var alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
    var n = readLine()!!.toInt()
    var s = readLine()!!.toMutableList()
    
    if(n != 0){
        for(i in 0..s.size-1){
            var index = alpha.indexOf(s[i]) + n
            if(index > 25){
                index %= 26
            }
            s[i] = alpha[index]
        }
    }
    print(s.fold(""){i,v -> i+v})
}
