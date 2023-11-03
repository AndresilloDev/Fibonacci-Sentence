import java.util.InputMismatchException;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Por favor, introduce un número entero como tope para la serie Fibonacci: ");
                int max = read.nextInt();

                int first = 0;
                int second = 1;
                int next;

                System.out.println("Serie Fibonacci: ");
                while (first <= max) {
                    System.out.println("\t" + first);
                    if (first == max) {
                        System.out.println("\nEl número " + max + " pertenece a la serie Fibonacci.");
                        break;
                    } else {
                        System.out.println("\t| ");
                    }
                    next = first + second;
                    first = second;
                    second = next;
                }

                if (first > max) {
                    System.out.println("El siguiente valor sería: " + first);
                }

                break; // Salir del bucle

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                read.next(); // Limpiar el buffer de entrada
            }
        }

        read.close();
    }
}