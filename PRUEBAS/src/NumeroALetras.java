import java.util.Scanner;

public class NumeroALetras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir un número entre 0 y 99
        do {
            System.out.print("Introduce un número entre 0 y 99: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 99);

        int decenas = numero / 10;  // Obtenemos las decenas
        int unidades = numero % 10; // Obtenemos las unidades

        // Parte de decenas
        switch (decenas) {
            case 0:
                break;
            case 1:
                if (unidades == 0) {
                    System.out.print("Diez");
                } else if (unidades == 1) {
                    System.out.print("Once");
                } else if (unidades == 2) {
                    System.out.print("Doce");
                } else if (unidades == 3) {
                    System.out.print("Trece");
                } else if (unidades == 4) {
                    System.out.print("Catorce");
                } else if (unidades == 5) {
                    System.out.print("Quince");
                } else if (unidades == 6) {
                    System.out.print("Dieciseis");
                } else if (unidades == 7) {
                    System.out.print("Diecisiete");
                } else if (unidades == 8) {
                    System.out.print("Dieciocho");
                } else if (unidades == 9){
                    System.out.print("Diecinueve");
                }
                break;

            case 2:
                if (unidades == 0) {
                    System.out.print("Veinte");
                } else {
                    System.out.print("Veinti");
                }
                break;

            case 3:
                System.out.print("Treinta");
                break;
            case 4:
                System.out.print("Cuarenta");
                break;
            case 5:
                System.out.print("Cincuenta");
                break;
            case 6:
                System.out.print("Sesenta");
                break;
            case 7:
                System.out.print("Setenta");
                break;
            case 8:
                System.out.print("Ochenta");
                break;
            case 9:
                System.out.print("Noventa");
                break;
        }

        // Parte de las unidades (cuando no son especiales)
        if (decenas != 1 && decenas != 2 || (decenas == 2 && unidades != 0)) {
            if (decenas > 2 && unidades > 0) {
                System.out.print(" y ");
            }
            switch (unidades) {
                case 0:
                    if (decenas == 0) System.out.print("Cero");
                    break;
                case 1:
                    System.out.print("Uno");
                    break;
                case 2:
                    System.out.print("Dos");
                    break;
                case 3:
                    System.out.print("Tres");
                    break;
                case 4:
                    System.out.print("Cuatro");
                    break;
                case 5:
                    System.out.print("Cinco");
                    break;
                case 6:
                    System.out.print("Seis");
                    break;
                case 7:
                    System.out.print("Siete");
                    break;
                case 8:
                    System.out.print("Ocho");
                    break;
                case 9:
                    System.out.print("Nueve");
                    break;
            }
        }

        System.out.println();
    }
}
