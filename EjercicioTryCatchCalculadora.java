import java.util.Scanner;
import java.util.InputMismatchException;

public class EjercicioTryCatchCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        String operador;

        while (true) {
            try {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    throw new Exception("Error: No pueden ser números negativos.");
                }

                System.out.print("Introduce el operador (+ | - | / | *): ");
                operador = sc.next();
                if (!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/"))) {
                    System.out.println("Operador no disponible");
                    continue;
                }

                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                if (num2 < 0) {
                    throw new Exception("Error: No pueden ser números negativos.");
                }

                if (operador.equals("/")) {
                    if (num2 == 0) {
                        throw new ArithmeticException("No puedes dividir un número entre 0.");
                    }
                    double resultadodiv = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultadodiv);

                } else if (operador.equals("+")) {
                    double resultadosuma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultadosuma);

                } else if (operador.equals("-")) {
                    double resultadoresta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultadoresta);

                } else if (operador.equals("*")) {
                    double resultadomult = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultadomult);
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir números.");
                sc.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }
}
