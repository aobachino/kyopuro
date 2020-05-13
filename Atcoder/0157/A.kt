fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toInt()
    
    if(n % 2 == 0){
        print(n/2)
        
    }else{
        print( ( (n+1) / 2 ) )   
    }
}
