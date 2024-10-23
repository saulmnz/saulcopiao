import java.util.Scanner;

public class primos{

    // Función para determinar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número n al usuario
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        // Mostrar los números primos entre 1 y n
        System.out.println("Números primos entre 1 y " + n + ":");
        for (int num = 2; num <= n; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
