fun main () {
    val point1 = Point()
    point1.x = 10
    point1.y = 12
    println(point1)
    val point2 = Point()
    point2.x = 10
    point2.y = 12

    println(point1.equals(point2))
    point1.moveY(y=-12)
    println(point1.y)
    println(point1)

}


class Point {
    var x: Int = 1
    var y: Int = 2

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other.x)
                if (y == other.y)
                    return true
        }
        return false
    }

    override fun toString(): String {
        return "$x; $y;"
    }

    fun moveY(y: Int) {
        this.y = y
        println("moving Y")
    }

}

