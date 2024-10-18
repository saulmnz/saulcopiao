/**
 *
 * Ejercicio 4 Boletín 4 ; Escribe un programa que solicite o usuario un número comprendido entre 1 e 99. O programa ten que mostralo con letras, por exemplo, para o 56, mostrará: “Cincuenta e seis”.
 *
 * @version 1.1
 *
 * @author SAUL ALVAREZ MONZON
 *
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void convertirNumeroALetras() {
        Scanner scanner = new Scanner(System.in); //Declaramos Scanner

        System.out.println("Ejercicio 4: Introduce un número y lo devolveremos en letras");

        System.out.print("Introduce un número comprendido entre 1 y 99: ");

        int numero = scanner.nextInt(); //Declaramos la variable número

        if (numero < 1 || numero > 99) { //Condición, si el número no está comprendido entre el 1 y el 99 entonces el número estará fuera de rango
            System.out.println("Número fuera de rango.");
            return;
        }

        String[] unidades = { //Declaramos las Unidades
                "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
        };
        String[] decenas = { //Declaramos Decenas
                "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        String[] especiales = { //Declaramos Números especiales
                "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };

        if (numero < 10) { //Condición, si el número es menor que 10 se imprimirá directamente la unidad declarada en los strings
            System.out.println(unidades[numero]);
        }
        else if (numero < 20) { //Si el número está comprendido entre 10 y 20 se imprimirán los números especiales declarados
            System.out.println(especiales[numero - 10]);
        }
        else {
            int dec = numero / 10; //Para obetener las decenas

            int uni = numero % 10; //Para obtener las unidades

            String resultado = decenas[dec] + (uni > 0 ? " y " + unidades[uni] : "");

            System.out.println(resultado);
        }
        System.out.println();
    }
}
