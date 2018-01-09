fun main(args: Array<String>) {
    // declaring the variables
    var num1: Int = 6
    var num2: Int = 2
    
    // showing on the screen
    println("sum: " + sum(num1, num2))
    println("subtraction: " + sub(num1, num2))
    println("multiplication: " + mult(num1, num2))
    println("division: " + div(num1, num2))
}

// sum function
fun sum(number1:Int, number2:Int):Int {
    return number1 + number2;
}

// subtraction function
fun sub(number1:Int, number2:Int):Int {
    return number1 - number2;
}

// multiplication function
fun mult(number1:Int, number2:Int):Int {
    return number1 * number2;
}

// division function
fun div(number1:Int, number2:Int):Int {
    return number1 / number2;
}

