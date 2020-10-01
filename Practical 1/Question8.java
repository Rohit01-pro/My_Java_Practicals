import java.util.Scanner;

public class Question8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        System.out.println("\nPATTERN:\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j >= (n + 1) - i && j <= (n - 1) + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
