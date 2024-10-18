/**
 *
 * Ejercicio 3 Boletín 4 ; Utiliza o operador ternario para calcular o valor absoluto dun número que se solicita o usuario por teclado.
 *
 * @version 1.1
 *
 * @author SAUL ALVAREZ MONZON
 *
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void calcularValorAbsoluto() {
        Scanner scanner = new Scanner(System.in); //Declaramos Scanner

        System.out.println("Ejercicio 3: Introduce un número cualquiera para conocer su valor absoluto");

        System.out.print("Introduzca el número: ");

        int numero = scanner.nextInt(); //Declaramos el número

        int valorAbsoluto = (numero < 0) ? -numero : numero; //Operación ternaria donde declaramos el valor absoluto utilizando la variable número
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto); //Imprimimos el Valor Absoluto del número Introducido
        System.out.println();
    }
}
