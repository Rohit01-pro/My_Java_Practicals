/*
 Steps to Run:
 1 -> javac Question9.java
 2 -> java Question9 10 20 30 40 50 60 70 80 90 100

 Output:
  Entered Values:
  10 20 30 40 50 60 70 80 90 100

  Maximum Value: 100
*/
public class Question9 {
    static int maxValue(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        try {
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print("Enter 10 Values at Runtime.");
            System.exit(0);
        }
        System.out.println("Entered Values: ");
        for (int i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n\nMaximum Value: " + maxValue(arr));
    }
}
