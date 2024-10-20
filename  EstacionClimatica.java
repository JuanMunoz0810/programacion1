import java.util.Scanner;

public class  EstacionClimatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempMax, tempMin;
        int dias = 0;
        double sumaTempMax = 0;
        double sumaTempMin = 0;
        int errores = 0;

        while (true){
            System.out.println("Ingrese temperatura maxima y minima (0,0 para terminar): ");
            tempMax = scanner.nextDouble();
            tempMin = scanner.nextDouble();

            if(tempMax == 0 && tempMin == 0){
                break;
            }
            dias ++;

            if (tempMax == 9 || tempMin == 9){
                errores++;
                System.out.println("Error: temperatura de 9º");
            }else{
                sumaTempMax += tempMax;
                sumatempMin += tempMin;
            }
            double mediaMax = sumaTempMax / (dias-errores);
            double mediaMin = sumaTempMin / (dias-errores);
            double porcentajeErrores = ((double) errores / dias)*100;
            
            System.out.println("Numero de dias: " + dias);
            System.out.println("Media temperatura maxima: " + mediaMax);
            System.out.println("Media de temperatura minima: " + mediaMin);
            System.out.println("Numero de errores (9º): " + errores);
            System.out.println("Porcentaje de errores: " + porcentajeErrores + "%");
        }
    }
}
