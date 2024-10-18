/**
 * Ejercicio 2 Boletín 4 ; Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distinto tipo de figuras.
 *
 * O usuario seleccionará a opción desexada escribindo a opción. Segundo esta, o programa pediralle os datos necesarios para realizar o cálculo, visualizará o resultado.
 *
 * No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “Opción incorrecta “.
 *
 * Realizar o programa mediante un switch case.
 *
 * 1…. Cadrado
 * 2…. Triangulo
 * 3…. Círculo
 *
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 *
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void calcularSuperficie() {

        Scanner scanner = new Scanner(System.in); //Se declara el scanner

        System.out.println("Ejercicio 2: Selecciona la figura de cual quieres saber su superficie");

        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");

        System.out.print("Introduce el número de la opción deseada: ");
        int opcion = scanner.nextInt(); //Se declara la variable opción

        switch (opcion) {
            case 1: // La variable opción en el caso 1 haría referencia a un Cuadrado
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("La superficie del cuadrado es: " + (lado * lado)); //Formula para calcular la superifice del cuadrado en el caso 1
                break;
            case 2: //La variable opción en el caso 2 haría referencia a un Triángulo
                System.out.print("Introduce la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("La superficie del triángulo es: " + (base * altura / 2));  //Formula para calcular la superifice del triángulo en el caso 2
                break;
            case 3: //La variable opción en el caso 3 haría referencia a un Círculo
                System.out.print("Introduce el radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("La superficie del círculo es: " + (Math.PI * radio * radio)); //Formula para calcular la superifice del círculo en el caso 3
                break;
            default:
                System.out.println("Opción incorrecta."); //Si no se introduce ningún número que haga referencia a los case, entonces la opción será incorrecta
        }
        System.out.println();
    }
}

