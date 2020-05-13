fun main(args: Array<String>) {
    // Your code here!
    var bingo1h:MutableMap<Int,Boolean> = mutableMapOf()
    var bingo2h:MutableMap<Int,Boolean> = mutableMapOf()
    var bingo3h:MutableMap<Int,Boolean> = mutableMapOf()
    var numList:MutableList<Int> = mutableListOf()
    var checkList:MutableList<Boolean> = mutableListOf()
    var msg = "No"
    
    get(bingo1h)
    get(bingo2h)
    get(bingo3h)
    
    var n = readLine()!!.toInt()
    
    for(i in 0..n-1){
        numList.add(readLine()!!.toInt())
    }
    
    for(i in 0..n-1){
        var num = numList[i]
        if(bingo1h.containsKey(num)){ bingo1h.set(num,true)}
        if(bingo2h.containsKey(num)){ bingo2h.set(num,true)}
        if(bingo3h.containsKey(num)){ bingo3h.set(num,true)}
    }
    
    for(i in 0..2){
        checkList.add(check("v",bingo1h.values.toList(),bingo2h.values.toList(),bingo3h.values.toList()))
        checkList.add(check("h",bingo1h.values.toList(),bingo2h.values.toList(),bingo3h.values.toList()))
        checkList.add(check("s",bingo1h.values.toList(),bingo2h.values.toList(),bingo3h.values.toList()))
    }
    
    var cnt = checkList.filter{it}.count() 
    if(cnt > 0){msg = "Yes"}
    print(msg)
}

//横判定、縦判定、斜め判定
fun check(str:String,ivList1:List<Boolean>,ivList2:List<Boolean>,ivList3:List<Boolean>):Boolean{
    var chk = false
    
    if(str == "h"){
        if(ivList1[0] && ivList1[1] && ivList1[2]){
            chk = true
            return chk
        }
        if(ivList2[0] && ivList2[1] && ivList2[2]){
            chk = true
            return chk
        }
        if(ivList3[0] && ivList3[1] && ivList3[2]){
            chk = true
            return chk
        }
    }else if(str == "v"){
        if(ivList1[0] && ivList2[0] && ivList3[0]){
            chk = true
            return chk
        }
        if(ivList1[1] && ivList2[1] && ivList3[1]){
            chk = true
            return chk
        }
        if(ivList1[2] && ivList2[2] && ivList3[2]){
            chk = true
            return chk
        }
        
    }else{
        if(ivList1[0] && ivList2[1] && ivList3[2]){
            chk = true
            return chk
        }
        if(ivList1[2] && ivList2[1] && ivList3[0]){
            chk = true
            return chk
        }

    }
    return chk
}

// ビンゴ取得
fun get(imap:MutableMap<Int,Boolean>){
    var line = readLine()!!.split(" ").map{it.toInt()}
    for(i in 0..2){
        imap.put(line[i],false)
    }
}