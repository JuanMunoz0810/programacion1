import java.util.Scanner;

public class ValormaximoyValorminimo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     int[] NUMEROS = new int[100];
     for(int I = 0; I <= 100; I++){
     System.out.println("Ingrese un numero: ");
     NUMEROS[I] = scanner.nextInt();
     }
     int MAXIMO = Integer.MIN_VALUE;
     int MINIMO = Integer.MAX_VALUE;
     for(int I= 0; I <= 100; I++ ){
        if(NUMEROS [I] > MAXIMO){
            MAXIMO = NUMEROS[I];
        }
        if(NUMEROS[I] < MINIMO){
            MINIMO = NUMEROS[I];
        }
      }
      System.out.println("MAXIMO" + MAXIMO);
      System.out.println("MINIMO" + MINIMO);
    }
}
