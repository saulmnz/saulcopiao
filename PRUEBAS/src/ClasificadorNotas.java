import java.util.Scanner;

public class ClasificadorNotas {

    // Método que clasifica la nota del alumno
    public static String clasificarNota(int nota) {
        String resultado;
        switch (nota) {
            case 1, 2, 3, 4:
                resultado = "Insuficiente";
                break;
            case 5:
                resultado = "Suficiente";
                break;
            case 6:
                resultado = "Bien";
                break;
            case 7, 8:
                resultado = "Notable";
                break;
            case 9, 10:
                resultado = "Sobresaliente";
                break;
            default:
                resultado = "Nota no válida";
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la nota del alumno
        System.out.println("Introduce la nota del alumno (1-10): ");
        int nota = scanner.nextInt();

        // Clasificamos la nota
        String clasificacion = clasificarNota(nota);

        // Mostramos el resultado
        System.out.println("La clasificación de la nota es: " + clasificacion);

        // Cerramos el scanner
        scanner.close();
    }
}
