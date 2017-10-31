int addTwoDigits(int n) {
    String valor = String.valueOf(n);
    return Integer.parseInt(String.valueOf(valor.charAt(0))) + Integer.parseInt(String.valueOf(valor.charAt(1)));

}
