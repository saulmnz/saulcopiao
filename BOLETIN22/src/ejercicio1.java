import java.util.Scanner;

public class ejercicio1 {
    public static void  descuento() {
        Scanner sc = new Scanner(System.in);

        // Leer precios
        System.out.println("Introduce el precio de tarifa: ");
        double precioTarifa = sc.nextDouble();
        System.out.println("Introduce el precio pagado: ");
        double precioPagado = sc.nextDouble();

        // Calcular porcentaje descontado
        double descuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;

        // Mostrar el resultado
        System.out.println("El porcentaje descontado es: " + descuento + "%");


    }
}