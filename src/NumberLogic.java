import java.util.Scanner;

public class NumberLogic {
    public static boolean defineOddOrEven(double a, double b, double c) {

        boolean b1 = a % 2 == 0;
        boolean b2 = b % 2 == 0;
        boolean b3 = c % 2 == 0;
        boolean answer = b1 && b2 && b3;
        return answer;
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input number a: ");
        double a = scanner.nextDouble();
        System.out.println("Please, input number b: ");
        double b = scanner.nextDouble();
        System.out.println("Please, input number c: ");
        double c = scanner.nextDouble();

        boolean result = defineOddOrEven(a, b, c);

        String msg = result ? "Numbers are even" : "Numbers are odd";

        System.out.println(msg);
        scanner.close();

    }

}
