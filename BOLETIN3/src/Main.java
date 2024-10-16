/**
 * Cuando el fichero Main empiece a correr automaticamente ejecutará todos los ejercicicios/programas a los que está ligado
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Main {
    public static void main(String[] args) {

        // Ejecutar los programas
        System.out.println("Ejecutando Programa 1:");
        ejercicio1.mostrarNumeroPositivo();

        System.out.println("Ejecutando Programa 2:");
        ejercicio2.restaOSuma();

        System.out.println("Ejecutando Programa 3:");
        ejercicio3.mostrarSigno();

        System.out.println("Ejecutando Programa 4:");
        ejercicio4.compararPeso();

        System.out.println("Ejecutando Programa 4:");
        ejercicio5.encontrarMayor();
    }
}