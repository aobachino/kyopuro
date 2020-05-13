fun main(args: Array<String>) {
    // Your code here!
    var (a,b) = readLine()!!.split(" ").map{it.toLong()}
    
    print(lcm(a,b))    
}

fun gcd(ia:Long,ib:Long):Long{

    if(ib === 0L){
        return ia
    }
    
    return gcd(ib,ia%ib)
}

fun lcm(ia:Long,ib:Long):Long{
    return ia*ib / gcd(ia,ib)
}