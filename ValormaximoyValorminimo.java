public class ValormaximoyValorminimo {
    public static void main(String[] args) {
       int I;
       double MAX, MIN, NUMERO = 0;
       MAX = NUMERO;
       MIN = NUMERO;
       for (I = 2; I <=100; I++){
       if (NUMERO > MAX){
        MAX = NUMERO;
       }else{
        if (NUMERO < MIN){
            MIN = NUMERO;
        }
       }
       }
      System.out.println("Maximo" + MAX + "Minimo" + MIN);
    }
}
