import java.util.Scanner;

public class Question2 {
    static Scanner input = new Scanner(System.in);

    static double circumCircle(double radius) {
        return 2 * Math.PI * radius; //2*3.14*10=62.8
    }

    static double areaCircle(double radius) {
        return Math.PI * (radius * radius); //3.14*10*10=314
    }

    public static void main(String args[]) {
        System.out.print("Enter Radius of Circle: ");
        double radius = input.nextDouble();
        System.out.println("\nRadius of Circle: " + radius); //10
        System.out.println("\nCircumference of Circle: " + circumCircle(radius));  //62.8
        System.out.println("\nArea of Circle: " + areaCircle(radius)); //314
    }
}
