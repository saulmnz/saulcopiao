
    import java.util.Scanner;

    public class notas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double suma = 0;
            int contador = 0;

            while (true) {
                System.out.print("Introduce una nota (introduce un número negativo para terminar): ");
                double nota = scanner.nextDouble();

                if (nota < 0) {
                    break; // Salir del bucle si la nota es negativa
                }

                suma += nota; // Sumar la nota a la suma total
                contador++; // Incrementar el contador de notas
            }

            if (contador > 0) {
                double media = suma / contador; // Calcular la media
                System.out.println("La media de las notas es: " + media);
            } else {
                System.out.println("No se introdujeron notas.");
            }

            scanner.close();
        }
    }


