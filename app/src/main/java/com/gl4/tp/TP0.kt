package com.gl4.tp

fun main(argv: Array<String>) {
    var hello = "Hello"
    hello = "Hello world!"
    println(hello)
   var  p1:Point= Point(2,2)
    var  p2:Point= Point(1,1)
    var  q1:Point= Point(3,3)
    var  q2:Point= Point(4,4)
    var r1:Rectangle= Rectangle()
    var r2:Rectangle=Rectangle(p1,q1)
    var r3:Rectangle=Rectangle(p2,q2)
    val rectangles = listOf(r1,r2,r3)
    for (i in 0..rectangles.size-1){
        println(rectangles[i].surface())
    }
}