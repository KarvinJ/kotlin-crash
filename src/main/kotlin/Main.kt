package knight.nameless


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val input = readln() // read input of the console
//    println("Hello, $input!") // print in the console
//
//
//    //simplest lambda function example, returns only a string with letters
//    val lettersOnly = input.filter {
//        it.isLetter()
//    }
//
////    changing the name of the (it) variable for something more descriptive
//    val lettersOnly2 = input.filter {
//        character -> character.isLetter()
//    }

    val rectangle = Rectangle2(4f, 5f)
    val circle = Circle(4f)

    // we can call all the variables define in the class, even area.
    println("rectangle: ${rectangle.width} x ${rectangle.height} = ${rectangle.area}")
    println("circle: ${circle.area}")

    // if the class that you are printing is a data class, then it will show the field and values of this class.
//    But if not the class will only show the address on memory of such rectangle object ie: knight.nameless.Rectangle2@58644d46
//    and when is a data class is like this: Rectangle2(width=4.0, height=5.0)
//    And when is a data class you can compare two classes like this rect1 == rect2 and if the values of all the variables.
//    on these classes are both the same then it will be true, but if the class is not data, this comparison will always give false.
    println(rectangle)

//    after we have defined that both the circle and rectangles classes implement the interface Shape,
//    now we can treat both as shapes. We also can do this with abstract class, but in this cases interface is a much
//    simpler way of achieve what we want.
    println(sumAreasOfShapes(circle, rectangle))

//    accessing increment counter via Inheritance of shapeAbstract
    rectangle.incrementCounter()
    println(rectangle.counter)
}

// in this function using the vararg enables to pass a variable number of arguments to a function,
// we should declare that function with a vararg parameter. the vararg argument will be treated as an array inside the function
//so with this we can define a function that will receive 0 or X arguments
fun sumAreasOfShapes(vararg shapes: ShapeAbstract): Double {
    return shapes.sumOf { shape -> shape.area }
}