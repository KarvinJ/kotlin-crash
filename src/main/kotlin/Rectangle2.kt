package knight.nameless

// you can define the fields of the class in the parenthesis and in the brackets
//The data class is for classes that mainly contain data and does functionality with this data. Given this information
// most of the classes are data classes.
data class Rectangle2(
    val width: Float,
    val height: Float

) : ShapeAbstract() { // for implement interface we do this : Shape. But for abstract class we do : ShapeAbstract()
    // the () is the main difference and after that everything works like a interface.

    // the brackets must be used for variables that depends on other calculus
    override val area: Double = (width * height).toDouble()
}