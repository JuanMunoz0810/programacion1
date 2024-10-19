import java.util.Scanner;

public class ValormaximoyValorminimo {
    public static void main(String[] args) {
        Scanner Scanner = Scanner(System.in);
        int I;
        double MAX, MIN, NUMERO;
        System.out.println("Ingrese numero");
        NUMERO = Scanner.nextDouble();
        MAX = NUMERO;
        MIN = NUMERO;
        for (I = 2; I <= 100; I++) {
            if (NUMERO > MAX) {
                MAX = NUMERO;
            } else {
                if (NUMERO < MIN) {
                    MIN = NUMERO;
                }
            }
        }
        System.out.println("Maximo" + MAX + "Minimo" + MIN);
    }
}
