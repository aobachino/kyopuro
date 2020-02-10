fun main(args: Array<String>) {
    // Your code here!
    val (S,T) = readLine()!!.split(" ")
    var (A,B) = readLine()!!.split(" ").map{it.toInt()}
    val U = readLine()!!
 
    if(U.equals(S)){
        print(A-1)
        print(" ")
        print(B)
    }else{
        print(A)
        print(" ")
        print(B-1)
    }
    
}