import java.util.Scanner;

public class ejercicio4 {
    public static void contador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desglose de una cantidad en billetes y monedas");
        System.out.print("Cantidad en euros: ");
        int cantidadEuros = sc.nextInt();

        int billetes100 = cantidadEuros / 100;
        cantidadEuros %= 100;
        int billetes20 = cantidadEuros / 20;
        cantidadEuros %= 20;
        int billetes5 = cantidadEuros / 5;
        cantidadEuros %= 5;
        int monedas1 = cantidadEuros;

        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Monedas de 1: " + monedas1);

    }
}