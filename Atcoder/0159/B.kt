fun main(args: Array<String>) {
    // Your code here!
    var s = readLine()!!
    var msg = "No"
    var len = s.length
    var num1 = (len-1)/2
    var num2 = ((len+3)/2) -1
    
    
    if(s.substring(0,num1) == s.substring(num2,len)){
        msg = "Yes"
    }
    
    print(msg)
    
}

