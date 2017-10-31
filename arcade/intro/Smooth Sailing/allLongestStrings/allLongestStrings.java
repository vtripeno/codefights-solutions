String[] allLongestStrings(String[] inputArray) {

    int maior = inputArray[0].length();
    int aux = 0;

    for(int i = 0; i < inputArray.length; i++) {
        if(maior < inputArray[i].length()) {
            maior = inputArray[i].length();
            aux = 1;
        } else if(maior == inputArray[i].length()) {
            aux ++;
        }
    }

    String auxArray[] = new String[aux];
    aux = 0;

    for(int i = 0; i < inputArray.length; i++) {
        if(inputArray[i].length() == maior) {
            auxArray[aux] = inputArray[i];
            aux++;
        }
    }

    return auxArray;
}
