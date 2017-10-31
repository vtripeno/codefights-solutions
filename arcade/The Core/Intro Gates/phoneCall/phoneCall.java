int phoneCall(int min1, int min2_10, int min11, int s) {
    if(s < min1) {
        return 0;
    }
    int firstPay = min1 * 1;
    int secondPay = min2_10 * 9;

    int after_m1 = s - firstPay;

    if (after_m1 < secondPay){
        return (1 + after_m1 / min2_10);
    }
    else{
        int after_m10 = after_m1 - secondPay;
        return (1 + 9 + after_m10 / min11);
    }


}
