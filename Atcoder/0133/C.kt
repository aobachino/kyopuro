fun main(args: Array<String>) {
    var (l, r) = readLine()!!.split(' ').map{ it.toLong() }
    var min = 2020L
    var pos: Long
    for (i in l until r ) {
        for (j in i+1 until r + 1) {
            val pos = i * j
            min = Math.min(min,pos % 2019L)
            if (min == 0L) break
        }
        if (min == 0L) break
    }
    println (min)
}
