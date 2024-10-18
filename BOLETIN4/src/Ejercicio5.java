/**
 *
 * Ejercicio 5 Boletín 4 ; EO DNI ten unha parte numérica de i díxitos seguido dunha letra que se obtén a partir do número da seguinte forma: letra = número DNI % 22
 *
 * @version 1.1
 *
 * @author SAUL ALVAREZ MONZON
 *
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void calcularLetraDNI() {

        Scanner scanner = new Scanner(System.in); //Se declara el scanner

        System.out.println("Ejercicio 5: Introduce los números de tu DNI para saber la letra");

        System.out.print("Número del DNI (8 dígitos): ");

        int dni = scanner.nextInt(); //Se declara la variable DNI

        char[] letras = { //Se declara la variable en la cual se basarán los datos introducidos
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        int indice = dni % 23;

        char letra = letras[indice];

        System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);

        System.out.println();
    }
}
