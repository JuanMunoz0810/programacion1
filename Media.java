import java.util.Scanner;

public class Media {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nombre;
    double basic, pascal, fortran, media;

    System.out.println("Ingrese el nombre del alumno (*** para terminar): ");
    nombre = scanner.nextLine();

    while (!nombre.equals("***")){
        System.out.println("Ingrese notas de BASIC, Pascal y FORTRAN: ");
        basic = scanner.nextDouble();
        pascal = scanner.nextDouble();
        fortran = scanner.nextDouble();
        media = (basic + pascal + fortran) / 3;
        System.out.println("Nombre: " + nombre + " Media: " + media);

        System.out.println("Ingrese el nombre del alumno (***para terminar): ");
        scanner.nextLine(); // Limpiar el buffer de entrada
         nombre = scanner.nextLine();
    }
  }
}
