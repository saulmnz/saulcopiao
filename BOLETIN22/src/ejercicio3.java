import java.util.Scanner;

public class ejercicio3 {
    public static void billetes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversión de billetes y monedas a euros");
        System.out.print("Introduce el número de billetes de 100€: ");
        int billetes100 = sc.nextInt();
        System.out.print("Introduce el número de billetes de 20€: ");
        int billetes20 = sc.nextInt();
        System.out.print("Introduce el número de billetes de 5€: ");
        int billetes5 = sc.nextInt();
        System.out.print("Introduce el número de monedas de 1€: ");
        int monedas1 = sc.nextInt();
        int totalEuros = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + monedas1;
        System.out.println("El total en euros es: " + totalEuros + "€");

    }
}
