import java.util.Scanner;
import java.util.InputMismatchException;

public class EjercicioBancoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dineroPropio = 0, dineroRetirar = 0, dineroImportar = 0;
        int accion;

        while (true) {
            try {
                System.out.print("Introduce la cantidad de dinero que tienes: ");
                dineroPropio = sc.nextInt();
                if (dineroPropio <= 0) {
                    throw new Exception("Error: No tienes dinero.");
                } else {
                    System.out.println("¿Que acción quieres realizar? 1. Retirar dinero / 2. Ingresar dinero");
                    accion = sc.nextInt();

                    if (accion == 1) {
                        System.out.print("Introduce la cantidad de dinero que quieres retirar: ");
                        dineroRetirar = sc.nextInt();
                        if (dineroRetirar > dineroPropio) {
                            throw new Exception("Error: No tienes tanto dinero para retirar.");
                        } else if (dineroRetirar > 500) {
                            throw new Exception("Lo sentimos, nuestro banco no permite retirar tanto dinero de golpe");
                        } else {
                            int dineroFinal = dineroPropio - dineroRetirar;
                            System.out.println("Has retirado " + dineroRetirar + " de tu cuenta. Ahora te quedan " + dineroFinal + " €");
                        }

                    } else if (accion == 2) {
                        System.out.print("Establece la cantidad de dinero que quieres importar: ");
                        dineroImportar = sc.nextInt();
                        int dineroFinal2 = dineroImportar + dineroPropio;
                        if (dineroImportar < 500) {
                            System.out.println("Has añadido " + dineroImportar + " a tu cuenta. Ahora tienes " + dineroFinal2 + " € disponibles");
                        } else if (dineroImportar<0) {
                            throw new Exception("La cantidad a importar debe ser mayor a 0");
                        } else {
                            throw new Exception("Lo sentimos, nuestro banco no permite importar tanto dinero de golpe");
                        }

                    } else {
                        throw new Exception("Error: Debes escoger una de las dos opciones");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir números.");
                sc.nextLine();
                continue;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                continue;
            }
        }
    }
}