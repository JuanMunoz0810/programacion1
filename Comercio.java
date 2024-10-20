import java.util.Scanner;

public class Comercio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char cordigo;
        double precio;
        int cantidad;
        int articulosA = 0;
        int articuloB = 0;
        double totalA = 0;
        double totalB = 0;
        
        while (true){
            System.out.println("Ingrese codigo del articulo (A/B/X): ");
            codigo = scanner.next().charAt(0);
            if (codigo == 'X'){
                break;
            }
            System.out.println("Ingrese precio unitario: " );
            precio = scanner.nextDouble();
            System.out.println("Ingrese numero de articulos: ");
            cantidad = scanner.nexInt();

            if (codigo == 'A'){
                articulosA += cantidad;
                totalA += precio*cantidad;
            }else if (codigo == 'B'){
                articulosB += cantidad;
                totalB += precio*cantidad;

                System.out.println("Numero de articulos de ctegoria A: " + articulosA);
                System.out.println("Importe total de articulos de categoria A: " + totalA);
                System.out.println("Numero de articulos de categoriaB: " + articulosB);
                System.out.println("Importe total de articulos B: " + totalB);
            }
            }
        }
    }
}
