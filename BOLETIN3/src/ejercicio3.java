import java.util.Scanner;
public class ejercicio3 {
    public static void mostrarSigno() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("+");
        }
        else if (numero < 0) {
            System.out.println("-");
        }
        else {
            System.out.println("0");
        }
    }
}