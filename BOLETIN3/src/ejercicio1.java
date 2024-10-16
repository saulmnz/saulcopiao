import java.util.Scanner;
public class ejercicio1 {
    public static void mostrarNumeroPositivo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es positivo");
        }
    }
}