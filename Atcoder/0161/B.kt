fun main(args: Array<String>) {
    // 実行不安定
    var (n,m) = readLine()!!.split(" ").map{it.toInt()}
    var votes = readLine()!!.split(" ").map{it.toInt()}.toList()
    var total = votes.reduce{x,y->x+y}.toFloat()
    var com = (total/(4*m)).toFloat()
    var msg = "No"
    var cnt = votes.filter{it.toFloat() >= com}.count()
    
    if(cnt >= m) msg = "Yes"
    
    print(msg)
    
}
