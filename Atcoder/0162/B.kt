fun main(args: Array<String>) {
    // Your code here!
    var x = readLine()!!.toLong()
    var numList:MutableList<Long> = mutableListOf()
    
    for(i in 1..x){
        if(i % 3 == 0.toLong() || i % 5 == 0.toLong()){
            numList.add(0)
        }else{
            numList.add(i)     
        }
    }
    println(numList.sum())
}
