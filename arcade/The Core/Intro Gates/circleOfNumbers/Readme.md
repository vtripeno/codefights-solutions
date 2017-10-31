Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be
circleOfNumbers(n, firstNumber) = 7.

Input/Output

    [time limit] 3000ms (java)

    [input] integer n

    A positive even integer.

    Guaranteed constraints:
    4 ≤ n ≤ 20.

    [input] integer firstNumber

    Guaranteed constraints:
    0 ≤ firstNumber ≤ n - 1.

    [output] integer

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

