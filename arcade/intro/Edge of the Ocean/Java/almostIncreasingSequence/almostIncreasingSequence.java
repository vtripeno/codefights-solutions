boolean almostIncreasingSequence(int[] sequence) {
    int strikes = 0;
    int max=-1000000;
    int secondMax=-1000000;

    for(int i = 0; i < sequence.length; i++){
        if(sequence[i] > max){
            secondMax = max;
            max = sequence[i];
        } else if(sequence[i] > secondMax){
            max = sequence[i];
            strikes++;
        }else
            strikes++;
    }

    return strikes < 2;
}
