/*
 Steps to Run:
 1 -> javac Question6.java
 2 -> java Question6 100 90 10 40 20 60 50 70 80 30

 Output:
  Entered Values:
  100 90 10 40 20 60 50 70 80 30

  Sorted in Asending Order:
  10 20 30 40 50 60 70 80 90 100

*/
public class Question6 {
    static void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception ex) {
            System.out.println("Enter Numbers Only.");
            System.exit(0);
        }

        System.out.println("Entered Values: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        sort(arr);

        System.out.println("\n\nSorted in Asending Order:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
