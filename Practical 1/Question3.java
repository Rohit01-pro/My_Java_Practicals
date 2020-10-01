import java.util.Scanner;

public class Question3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is EVEN.");
        else
            System.out.println("Number is ODD.");
    }
}
