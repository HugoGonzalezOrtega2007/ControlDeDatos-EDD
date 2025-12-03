import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una edad o un año: ");

        while (!sc.hasNextInt()) {
            System.out.print("Entrada no válida. Escribe un número: ");
            sc.next();  // limpiar entrada incorrecta
        }

        int valor = sc.nextInt();

        System.out.println("Has introducido una edad/año correcto");
    }
}
