/**
 * Boletín 2 Ejercicio 2; Programa que calcule el area de un cuadrado
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Valor del lado del cuadrado");

        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println(area + " es el area del cuadrado");

    }
}
