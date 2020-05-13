fun main(args: Array<String>) {
    // Your code here!
    var s = readLine().toString()
    var th = s.substring(2,3)
    var fo = s.substring(3,4)
    var fi = s.substring(4,5)
    var si = s.substring(5,6)
    if(th == fo && fi == si){
        println("Yes")        
    }else{
        println("No")                
    }

}
