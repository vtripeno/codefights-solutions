int lateRide(int n) {

    StringBuilder hora = new StringBuilder().append(n/60).append(n%60);
    int soma = 0;
    for(int i = 0; i < hora.length(); i++){
           soma +=  Integer.parseInt(String.valueOf(hora.charAt(i)));
    }

    return soma;
}
