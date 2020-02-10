fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toInt()
    var cnts = readLine()!!.split(" ").map{it.toInt()}
    var n_list = cnts.distinct()
    
    if(cnts.size == n_list.size){
        print("YES")         
    }else{
        print("NO")         
    }
}