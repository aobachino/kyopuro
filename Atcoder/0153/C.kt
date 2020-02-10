fun main(args:Array<String>){
    val (N,K) = readLine()!!.split(" ").map{it.toInt()}
    var hp = readLine()!!.split(" ").map(String::toLong).sortedDescending()

    var total = 0L
    if(N <= K){
        print(0)
    }else{
        for(i in K..(N-1)){
           total  += hp[i]
        }
        print(total)
    }
    
}
