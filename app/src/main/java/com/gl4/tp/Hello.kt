package com.gl4.tp

import java.lang.Math.abs

fun main(argv: Array<String>) {
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto:String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message.toString())
    var i =somme(1,2)
    println(i)
    println(sayMyName("arwa"))
    println(sayHello())
    val languages = listOf("Java", "Python", "C")
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
    println(operation(1,2,"+"))
}
fun  somme(a:Int,b:Int):Int{
    return a+b


}
fun sayMyName(name:String) { println(" $name ") }
fun sayHello(): String = "Hello"
fun showList(list: List<String>){
    for (i in 0..list.size-1){
        println(list[i])
    }
}
fun oddNumbersTo10(){
    for (i in 0..10){
        if (i % 2!=0){
            println(i)
        }
    }
}
fun operation(a:Int,b:Int,o:String):Int?{
    when(o){
        "+" -> return(a+b)
        "-" ->return(a-b)
        "*"-> return(a*b)
        "/"-> return(a/b)
        else -> return null
    }
}
fun distance(A:Point,B:Point):Int{
    return abs(A.X-B.X)+abs(A.X-B.X)
}




