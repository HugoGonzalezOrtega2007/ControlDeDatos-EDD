import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int año = 0;

        System.out.print("Introduce el día: ");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Escribe un número para el día: ");
                sc.next();
                continue;
            }
            dia = sc.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.print("Día inválido. Debe estar entre 1 y 31. Intenta de nuevo: ");
                continue;
            }
            break;
        }

        System.out.print("Introduce el mes: ");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Escribe un número para el mes: ");
                sc.next();
                continue;
            }
            mes = sc.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.print("Mes inválido. Debe estar entre 1 y 12. Intenta de nuevo: ");
                continue;
            }
            break;
        }

        System.out.print("Introduce el año (4 dígitos): ");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Escribe un número para el año: ");
                sc.next();
                continue;
            }
            año = sc.nextInt();
            break;
        }

        int diasMes = 31;
        switch (mes) {
            case 2:
                diasMes = 28;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
        }

        if (dia <= diasMes) {
            System.out.println("Fecha válida: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("Fecha NO válida. Ese mes tiene como máximo " + diasMes + " días.");
        }

        sc.close();
    }
}
