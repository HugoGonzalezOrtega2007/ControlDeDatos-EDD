import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pin;

        while (true) {
            System.out.print("Crea un PIN de 4 dígitos: ");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada no válida. Debe añadir un pin de 4 digitos.");
                sc.next();
                continue;
            }

            pin = sc.next();

            if (pin.length() == 4) {
                System.out.println("Has añadido un PIN correcto");

                System.out.print("Introduce de nuevo el PIN para verificarlo: ");

                while (!sc.hasNextInt()) {
                    System.out.print("Entrada no válida. Escribe un número: ");
                    sc.next();
                }

                String pinCheck = sc.next();

                if (pin.equals(pinCheck)) {
                    System.out.println("PIN correcto.");
                } else {
                    System.out.println("PIN incorrecto.");
                }

                break;

            } else {
                System.out.println("El PIN debe tener exactamente 4 dígitos.");
            }
        }

        sc.close();
    }
}
