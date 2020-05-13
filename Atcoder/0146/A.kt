fun main(args: Array<String>) {
    // Your code here!
    var dayOf = mutableListOf("SUN","MON","TUE","WED","THU","FRI","SAT") 
    var s = readLine()!!
    var cnt = 7 - dayOf.indexOf(s)
    
    println(cnt)
}
