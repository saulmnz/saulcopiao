import java.util.Scanner;
public class ejercicio2 {
    public static void grados() {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            double kelvin = celsius + 273;
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
            System.out.println("Temperatura en Kelvin: " + kelvin);



    }
}