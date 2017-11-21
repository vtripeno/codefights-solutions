Given integers a and b, determine whether the following pseudocode results in an infinite loop

while a is not equal to b do
  increase a by 1
  decrease b by 1

Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.

Example

    For a = 2 and b = 6, the output should be
    isInfiniteProcess(a, b) = false;
    For a = 2 and b = 3, the output should be
    isInfiniteProcess(a, b) = true.

Input/Output

    [time limit] 3000ms (java)

    [input] integer a

    Guaranteed constraints:
    0 ≤ a ≤ 20.

    [input] integer b

    Guaranteed constraints:
    0 ≤ b ≤ 20.

    [output] boolean

    true if the pseudocode will never stop, false otherwise.

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

