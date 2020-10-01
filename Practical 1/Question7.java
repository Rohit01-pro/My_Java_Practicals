import java.util.Scanner;

public class Question7 {
    static Scanner input = new Scanner(System.in);

    static int factorial(int num) {
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.print("Factorial of Number: " + factorial(num));

    }

}
