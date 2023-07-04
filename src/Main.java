// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    static double calculate(double A, double B, double C) {
        double delta = Math.pow(B, 2)-4*A*C;
        double result = B;

        return result;
    }

    public static void main(String[] args) {



        /*
        static boolean checkRes(String res) {
            if (res.equals("s")) {
                return true;
            } else {
                return false;
            }
        };
        */

        boolean runProgram = false;
        boolean resCheck = false;
        String methodsRes;

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        do {
            do {
                System.out.println("Calculadora de Baskhara :");
                System.out.println("Estabeleça o valor da variável A");
                a = sc.nextDouble();
                System.out.println("Estabeleça o valor da variável B");
                b = sc.nextDouble();
                System.out.println("Estabeleça o valor da variável C");
                c = sc.nextDouble();
                System.out.printf("Os valores selecionados foram %n A: %.2f%n B: %.2f%n C: %.2f%n", a, b, c);
                System.out.print("Você digitou as variáveis corretamente? (s/n)");
                methodsRes = sc.next();
                //checkRes(methodsRes);
            } while (resCheck == false);
            System.out.print("Fora do Loop");
        } while (runProgram == true);

        sc.close();
    }
}