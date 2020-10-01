import java.util.Scanner;

public class Question5 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Month Name: ");
        String month = input.next();
        
        switch (month) {

            case "January":
                System.out.println("January has 31 Days.");
                break;
            case "February":
                System.out.println("February has 28 or 29 Days.");
                break;
            case "March":
                System.out.println("March has 31 Days.");
                break;
            case "April":
                System.out.println("April has 30 Days.");
                break;
            case "May":
                System.out.println("May has 31 Days.");
                break;
            case "June":
                System.out.println("January has 30 Days.");
                break;
            case "July":
                System.out.println("July has 31 Days.");
                break;
            case "August":
                System.out.println("August has 31 Days.");
                break;
            case "September":
                System.out.println("September has 30 Days.");
                break;
            case "October":
                System.out.println("October has 31 Days.");
                break;
            case "November":
                System.out.println("November has 30 Days.");
                break;
            case "December":
                System.out.println("December has 31 Days.");
                break;
        }
    }
}
