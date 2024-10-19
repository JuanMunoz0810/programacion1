import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SW = 0;
        double N;

        while (SW == 0){
            try{
                System.out.println("Ingrese un numero: ");
                N = scanner.nextDouble();
                if (N != (int) N){
                 System.out.println("Dato no valido");
                 System.out.println("Ejecute nuevamente");
                 SW = 1;
                }
            } catch (InputMismatchException e){
                System.out.println("Dato no valido");
                System.out.println("Ejecute nuevamente");
                scanner.next(); // Limpiar eñ buffer de entrada
            }
        }
    }
}
