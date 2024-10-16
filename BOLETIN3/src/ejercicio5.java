import java.util.Scanner;

/**
 * Se introduciran y compararán 3 números, entre esos tres el programa empezará la comparación y mostrará
 * por pantallo el número mayor
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class ejercicio5 {
    public static void encontrarMayor() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor.");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor.");
        }
        else {
            System.out.println(num3 + " es el mayor.");
        }
    }
}