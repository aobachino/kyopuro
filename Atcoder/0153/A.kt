fun main(args:Array<String>){
    val input = readLine()!!.split(" ").map(String::toDouble)
    print(Math.ceil(input[0]/input[1]).toInt())
}