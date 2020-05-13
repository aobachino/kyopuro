fun main(args: Array<String>) {
    // Your code here!
    val n = readLine()!!.toLong()
    var cnt = 0L 
    val keta = n.toString().length.toLong()
    
    if(keta % 2 == 0L){
        for(i in 0..keta.toInt()-1){
            if(i % 2 != 0){
                continue
            }
            cnt += 9L * (Math.pow(10.toDouble(),i.toDouble()).toLong())
        }
    }else{
        for(j in 0..keta.toInt()){
            if(j % 2 != 0){
                continue
            }
            
            if(j == (keta.toInt()-1)){
                cnt += n.toLong() - (Math.pow(10.toDouble(),j.toDouble()).toLong()) + 1L
                continue
            }
            
            cnt += 9L * (Math.pow(10.toDouble(),j.toDouble()).toLong())
        }
    }
    println(cnt)
}