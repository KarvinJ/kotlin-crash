package knight.nameless

// with the object annotation in kotlin we indicate that this is a singleton object that will only exist a single
// instance in the lifecycle of our program.
object SingletonShape : ShapeAbstract() {

    override val area: Double = 16.0
}