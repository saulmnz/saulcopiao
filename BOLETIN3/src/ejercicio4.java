import java.util.Scanner;
public class ejercicio4 {
    public static void compararPeso() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la primera persona: ");
        String nombre1 = sc.nextLine();

        System.out.print("Peso de la primera persona: ");
        double peso1 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Nombre de la segunda persona: ");
        String nombre2 = sc.nextLine();

        System.out.print("Peso de la segunda persona: ");
        double peso2 = sc.nextDouble();

        if (peso1 > peso2) {
            System.out.println(nombre1 + " pesa más con " + peso1 + "kg.");
            System.out.println("Diferencia de peso: " + (peso1 - peso2) + "kg.");
        } else {
            System.out.println(nombre2 + " pesa más con " + peso2 + "kg.");
            System.out.println("Diferencia de peso: " + (peso2 - peso1) + "kg.");
        }
    }
}