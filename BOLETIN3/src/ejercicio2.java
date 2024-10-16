import java.util.Scanner;

/**
 * Éste programa pedirá dos números, si el primer número es mayor o igual al segundo número se realizará la resta entre el primer número y el segundo,
 * de lo contrario, se realizará una suma.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

class ejercicio2 {
    public static void restaOSuma() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número:  ");
        short num1 = sc.nextShort();

        System.out.print("Introduce el segundo número:  ");
        short num2 = sc.nextShort();

        if (num1 >= num2) {
            System.out.println("La resta es: " + (num1 - num2));
        }

        System.out.println("La suma es: " + (num1 + num2));
    }
}