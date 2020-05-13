fun main(args: Array<String>) {
    // Your code here!
    var (a,b) = readLine()!!.split(" ").map{it.toInt()}
    var str = ""

    if(a <= b){
        str = a.toString().repeat(b)
    }else{
        str = b.toString().repeat(a)
    }
    
    print(str)    
}
