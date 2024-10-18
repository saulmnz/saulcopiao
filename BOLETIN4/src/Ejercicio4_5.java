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

public class Ejercicio4_5 { //Este ejercicio es igual que el 4 pero con la variable switch

    public static void NumerosALetras() {
        Scanner scanner = new Scanner(System.in);
        int numero;  //Se declara la variable del número a introducir

        do {
            System.out.print("Introduce un número entre 0 y 99: ");
            numero = scanner.nextInt(); //Se introduce la variable
        }

        while (numero < 0 || numero > 99); //El número comprendido entre 0 y 99

        int decenas = numero / 10;  // Para obtener las decenas

        int unidades = numero % 10; // Para obtener las unidades


        switch (decenas) {  //Switch para la variable decenas y caracteres especiales
            case 0:
                break;
            case 1: //En el caso 1 declaramos las decenas comprendidas entre 10 || 20
                if (unidades == 0) {
                    System.out.print("Diez");
                } else if (unidades == 1) {
                    System.out.print("Once");
                } else if (unidades == 2) {
                    System.out.print("Doce");
                } else if (unidades == 3) {
                    System.out.print("Trece");
                } else if (unidades == 4) {
                    System.out.print("Catorce");
                } else if (unidades == 5) {
                    System.out.print("Quince");
                } else {
                    System.out.print("Dieci");
                }
                break;
            case 2:  // En el caso 2 declaramos que si la unidad acaba en 0 y la decena es 20 entonces escribirá veinte, de lo contrario Veinti
                if (unidades == 0) {
                    System.out.print("Veinte");
                } else {
                    System.out.print("Veinti");
                }
                break;
            case 3:  //En el caso 3 se acaban de declarar las demás decenas
                System.out.print("Treinta");
                break;
            case 4:
                System.out.print("Cuarenta");
                break;
            case 5:
                System.out.print("Cincuenta");
                break;
            case 6:
                System.out.print("Sesenta");
                break;
            case 7:
                System.out.print("Setenta");
                break;
            case 8:
                System.out.print("Ochenta");
                break;
            case 9:
                System.out.print("Noventa");
                break;
        }

        // Unidades (cuando no son especiales)
        if (decenas != 1 && decenas != 2 || (decenas == 2 && unidades != 0)) {
            if (decenas > 2 && unidades > 0) {
                System.out.print(" y ");

            }

            switch (unidades) { //Se declaran las Unidades
                case 0:
                    if (decenas == 0) System.out.print("Cero");
                    break;
                case 1:
                    System.out.print("Uno");
                    break;
                case 2:
                    System.out.print("Dos");
                    break;
                case 3:
                    System.out.print("Tres");
                    break;
                case 4:
                    System.out.print("Cuatro");
                    break;
                case 5:
                    System.out.print("Cinco");
                    break;
                case 6:
                    System.out.print("Seis");
                    break;
                case 7:
                    System.out.print("Siete");
                    break;
                case 8:
                    System.out.print("Ocho");
                    break;
                case 9:
                    System.out.print("Nueve");
                    break;
            }
        }

        System.out.println();
    }
}