fun main(args: Array<String>) {
    // Your code here!
    val (h,w) = readLine()!!.split(" ").map{it.toLong()}
    
    if(h == 1L || w == 1L ){
        print(1)
    }else{
        if(h % 2L == 0L && w % 2L == 0L){
            print(w / 2 * h)
        }else if(h % 2L == 0L && w % 2L != 0L){
            print(h / 2L * w)
        }else if(h % 2L != 0L && w % 2L == 0L){
            print(w / 2L * h)
        }else{
            print(w * (h/2L) + (w/2L+1L))
        }        
    }
}