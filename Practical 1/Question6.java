/*
 Steps to Run:
 1 -> javac Question9.java
 2 -> java Question9 10 20
 
 Output:
 Number 1: 10
 Number 2: 20
 Sum of Two Number: 30
*/
public class Question6 {
    public static void main(String args[]) {
        int num1 = 0, num2 = 0;
        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print("Enter 2 Values at Runtime.");
            System.exit(0);
        }
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        System.out.println("Sum of Two Number: " + (num1 + num2));
    }
}
