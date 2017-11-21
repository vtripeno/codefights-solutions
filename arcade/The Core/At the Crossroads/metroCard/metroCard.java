int[] metroCard(int lastNumberOfDays) {
    int[] a = {28, 30, 31};
    int[] b = {31};
    return (lastNumberOfDays == 31) ? a : b;
}
