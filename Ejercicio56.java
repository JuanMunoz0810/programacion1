import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        double nota = 0.0;
        int Aprobados = 0, noAprobados = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite la cantidad de estudiantes: ");
        int estudiantes = leer.nextInt();

        for (int i= 1; i <= estudiantes; i++) {
            System.out.print("Nota del estudiante" + i + ":");
            nota = leer.nextDouble();

            if (nota >= 5.0) {
                Aprobados++;
            } else {
                noAprobados++;
            }

        }
        System.out.println("Aprobados :" + Aprobados + "noAprobados" + noAprobados);
    }
}