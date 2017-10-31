int adjacentElementsProduct(int[] inputArray) {
    int aux = 0;
    int result = 0;
    int contador = 0;
    while(contador < inputArray.length - 1) {
        System.out.println(contador);
        aux = inputArray[contador] * inputArray[contador + 1];
        if(aux > result)
            result = aux;
        else if(result == 0)
            result = aux;
        contador++;
    }
    return result;
}
