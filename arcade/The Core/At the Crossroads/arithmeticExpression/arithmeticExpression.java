boolean arithmeticExpression(int a, int b, int c) {
    return a + b == c ? true : 
            a - b == c ? true :
            a * b == c ? true :
            a / b == c && a % b == 0;
}
