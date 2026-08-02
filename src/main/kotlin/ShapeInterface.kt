package knight.nameless

//Example of interface, every class that implements an interface should have defined an area.
//the sealed is very optional, in some cases this could be a secure way to handle interface
//A sealed class in Kotlin is a special type of class that restricts the hierarchy of subclasses to a specific set
// defined within the same file, ensuring that all possible subclasses are known at compile time
sealed interface ShapeInterface {

    val area: Double

    fun helloWorld()
}