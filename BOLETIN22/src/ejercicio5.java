import java.util.Scanner;

public class ejercicio5 {
    public static void sueldo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular sueldo bruto y líquido");
        System.out.print("Sueldo fijo: ");
        double sueldoFijo = sc.nextDouble();
        System.out.print("Total de ventas: ");
        double importeVendas = sc.nextDouble();
        System.out.print("Kilómetros recorridos: ");
        int quilometros = sc.nextInt();
        System.out.print("Días de desplazamiento: ");
        int diasDesprz = sc.nextInt();

        double comision = 0.05 * importeVendas;
        double quilometraje = 2 * quilometros;
        double dietas = 30 * diasDesprz;
        double sueldoBruto = sueldoFijo + comision + quilometraje + dietas;
        double irpf = 0.18 * sueldoBruto;
        double sueldoLiquido = sueldoBruto - irpf - 36;

        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Sueldo líquido: " + sueldoLiquido);
        sc.close();
    }
}