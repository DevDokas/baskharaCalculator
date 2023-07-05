// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean runProgram = false;
        String methodsRes;

        double a;
        double b;
        double c;


        Scanner sc = new Scanner(System.in);

        do {

                System.out.println("Calculadora de Baskhara :");

                System.out.println("Estabeleça o valor da variável A");
                a = sc.nextDouble();

                System.out.println("Estabeleça o valor da variável B");
                b = sc.nextDouble();

                System.out.println("Estabeleça o valor da variável C");
                c = sc.nextDouble();

                System.out.printf("Os valores selecionados foram %n A: %.2f%n B: %.2f%n C: %.2f%n", a, b, c);
                double delta = b*b-4*a*c;

                System.out.print("Você digitou as variáveis corretamente? (s/n)");
                methodsRes = sc.next();

                if (methodsRes.equals("s")) {

                    if (delta < 0) {
                        System.out.println("Não possui raiz real");
                        runProgram = true;
                    } else if (delta == 0) {
                        double root = -b/(2*a);
                        System.out.println("A equação possui uma raiz real : " + root);
                        runProgram = true;
                    } else {
                        double rootMax = (-b + Math.sqrt(delta)) / (2 * a);
                        double rootMin = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("A equação possui dois valores reais:");
                        System.out.println("Raiz positiva:" + rootMax);
                        System.out.println("Raiz negativa:" + rootMin);
                        runProgram = true;
                    }
                }
        } while (!runProgram);

        System.out.println("Fora do Loop");

        sc.close();
    }
}