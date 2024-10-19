import java.util.Scanner;

public class MediaParejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1, N2;
        double M, MAX = Double.NEGATIVE_INFINITY;

        System.out.println("Ingrese dos numeros (999 para terminar): ");
        N1 = scanner.nextInt();
        N2 = scanner.nextInt();

        while(N1 != 999 || N2 != 999){
            M = (N1 + N2) / 2.0;
            if(M > MAX){
                MAX = M;
            }
            System.out.println("Ingrese dos numeros (999 para terminar): ");
            N1 = scanner.nextInt();
            N2 = scanner.nextInt();
        }
        System.out.println("Media maxima= " + MAX);
    }
}