package com.gl4.tp

import java.lang.Math.abs

class Rectangle(val p:Point=Point(0,0),val q:Point=Point(1,1)) {
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface():Int{
        return abs(p.X-q.X)*abs(p.Y-q.Y)

    }
}