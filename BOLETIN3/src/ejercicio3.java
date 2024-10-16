import java.util.Scanner;

/**
 * El programa nos informará del signo que corresponde al número que introdujimos, +, - y si el número es 0 se mostrará 0 por la ausencia de signo.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class ejercicio3 {
    public static void mostrarSigno() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("+");
        }
        else if (numero < 0) {
            System.out.println("-");
        }
        else {
            System.out.println("0");
        }
    }
}