import java.util.Scanner;

/**
 * Si el número que introdujiste es positivo el programa lo indicará, de lo contrario, no habrá respuesta
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
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