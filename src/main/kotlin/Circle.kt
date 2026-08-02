package knight.nameless

import kotlin.math.PI

data class Circle(

    val radius: Float
) : ShapeAbstract() { // here we indicate that this class implement the shape interface

    // fill the area data define in the shape interface with the corresponding values of the circle
    override val area: Double = radius * radius * PI
}
