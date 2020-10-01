import java.util.Scanner;

public class Question2 {
    static Scanner input = new Scanner(System.in);

    static double circumCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    static double areaCircle(double radius) {
        return Math.PI * (radius * radius);
    }

    public static void main(String args[]) {
        System.out.print("Enter Radius of Circle: ");
        double radius = input.nextDouble();
        System.out.println("\nRadius of Circle: " + radius);
        System.out.println("\nCircumference of Circle: " + circumCircle(radius));
        System.out.println("\nArea of Circle: " + areaCircle(radius));
    }
}
