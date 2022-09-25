import java.util.Scanner;

public class PalindromeNumber {

    public static boolean checkPalindrome(int number) {

        if (number <= 0) {
            return false;
        }

        int copy = number;
        int num = 0;

        while (copy > 9) {
            num += copy % 10;
            num *= 10;
            copy /= 10;
        }

        num += copy;

        return num == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input four-digit number: ");
        int number = scanner.nextInt();

        boolean result = checkPalindrome(number);

        String msg = result ? "Yes, number is palindrome"
                : "No, number is not palindrome";

        System.out.println(msg);
        scanner.close();
    }
}

