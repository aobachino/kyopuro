fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    var juns = readLine()!!.split(" ").map{it.toInt()}
    var min = juns[0]
    var cnt = 0.until(n).count{ 
      i -> val pi = juns[i]
      if(pi <= min){
          min = pi
          true
      }else{
          false
      }
    }
    
    print(cnt)
}   