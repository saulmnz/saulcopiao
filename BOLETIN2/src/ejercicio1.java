/**
 * Boletín 2 Ejercicio 1; Programa que calcule el area de un triángulo
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
import java.util.Scanner;
public class ejercicio1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduce el valor de la base");
        double base = scanner.nextDouble();

        System.out.print("Introduce el valor de la altura");
        double altura = scanner.nextDouble();

        double area = base * altura /2 ;

        System.out.println(area + " es el area del triángulo")

    }
}


