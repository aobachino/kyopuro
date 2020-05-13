fun main(args: Array<String>) {
    // Your code here!
    var x = readLine()!!.toInt()
    println(sigma(x))
}

fun gcd(a:Int,b:Int):Int{
    if(b===0){
        return a
    }
    return gcd(b,a%b)
}

fun sigma(k:Int):Int{
    var ans = 0
    for(i in 1..k){
        for(j in 1..k){
            for(l in 1..k){
                ans += gcd(gcd(i,j),l)                
            }
        }
    }
    return ans
}
