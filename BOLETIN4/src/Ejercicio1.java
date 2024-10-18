/**
 * Ejercicio 1 Boletín 4 ; Un almacén clasifica os seus produtos segundo a seguinte táboa de vendas anuais:
 *
 * Vendas anuais Artigo de consumo
 *
 * < = 100 produtos baixo
 * >100 e < = 500 medio
 * > 500 e < = 1000 alto
 * > 1000 primeira necesidade
 *
 * Coñecido o nome do artigo e as vendas anuais. Indicar de que tipo é.
 *
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 *
 */

import java.util.Scanner; // Declaramos Scanner

public class Ejercicio1 {
    public static void clasificarproducto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 1: Clasificación según la cantidad de artículos vendidos en un año");

        System.out.print("Nombre del artículo: ");

        String nombreArticulo = scanner.nextLine(); //Declaramos la Variable del nombre del artícul

        System.out.print("Número de ventas anuales del artículo: ");
        int ventasAnuales = scanner.nextInt(); //Declaramos La variable ventas anuales la cual posteriormente vamos a comprar para imprimir por pantalla distintos resultados

        if (ventasAnuales <= 100) { //Si el artículo es menor o igual a cien, baja demanda
            System.out.println("El artículo " + nombreArticulo + " es de baja demanda.");
        }

        else if (ventasAnuales <= 500) {  //Si el artículo es menor o igual a 500 de consumo medio
            System.out.println("El artículo " + nombreArticulo + " es de consumo medio.");
        }

        else if (ventasAnuales <= 1000) { //Si el artículo es menor o igual a 1000 es de alta demanda
            System.out.println("El artículo " + nombreArticulo + " es de alta demanda.");
        }

        else { //Si el articulo es mayor a todos los valores indicados anteriormente entonces el artículo es de primera necesidad
            System.out.println("El artículo " + nombreArticulo + " es de primera necesidad.");
        }

        System.out.println();

    }


}

