package knight.nameless

// with and abstract class we can achieve the same functionality that we have in an interface, but with more options
//And also we are not obligated to implement all the fields and functions that we have defined in the class.
//And we have all the functionality of a class, like we can make logic for all shapes in a function and in an interface not
// In an interface we just define the values and function that a class should have, but we don't code the logic.
abstract class ShapeAbstract {

    abstract val area: Double

    var counter: Int = 0

    fun incrementCounter() {
        counter++
    }
}