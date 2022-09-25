import java.util.Scanner;

public class MathLogic {
    public static boolean determineBelonging(double x, double y) {

        double x1 = 3;
        double x2 = 9;
        double y1 = 2;
        double y2 = 11;
        
        boolean answer = (x >= x1) && (x <= x2) && (y >= y1) && (y <= y2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input x value: ");
        double x = scanner.nextDouble();

        System.out.println("Input y value: ");
        double y = scanner.nextDouble();


        boolean result = determineBelonging(x, y);

        String msg = result ? "The point inside rectangle"
                : "The point outside rectangle";

        System.out.println(msg);
        scanner.close();
    }
}







