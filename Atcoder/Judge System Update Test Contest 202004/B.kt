fun main(args: Array<String>) {
    // Your code here!
    var n = readLine()!!.toInt()
    val ballMap: MutableMap<Int, String> = mutableMapOf()
    
    for(i in 1..n){
        var (x,c) =  readLine()!!.split(" ")
        ballMap.put(x.toInt(),c)
    }
    
    var a = ballMap.toList().groupBy{it.second}.toMap()
    var r:List<Pair<Int, String>> = listOf()
    var b:List<Pair<Int, String>> = listOf()
    
    if(a.keys.size == 2){
        r = a.get("R")!!.sortedBy{it.first}        
        b = a.get("B")!!.sortedBy{it.first}        
        r.forEach{println(it.first)}
        b.forEach{println(it.first)}
    }else{
        if(a.keys.contains("R")){
            r = a.get("R")!!.sortedBy{it.first}
            r.forEach{println(it.first)}            
        }else{
            b = a.get("B")!!.sortedBy{it.first}        
            b.forEach{println(it.first)}
        }

    }
}
