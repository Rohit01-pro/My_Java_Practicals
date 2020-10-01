/**
 * Example of STATIC Keyboard.
 */
class Book {
    int bookId;
    String bookName;
    double bookPrice;
    static int bookCount = 0;
    static String library = "Collage Library";

    public Book() {
        bookCount++;
    }

    public Book(int id, String name, double price) {
        this();
        this.bookId = id;
        this.bookName = name;
        this.bookPrice = price;
    }
    public void showBook(){
        System.out.println(this.bookId + "  " + this.bookName + "  " + this.bookPrice + "  " + library);
    }
}

public class Question5 {
    public static void main(String[] args) {
     
      Book b1 = new Book(101,"Android",1234.55);
      Book b2 = new Book(102,"Java   ",1334.55);  
      Book b3 = new Book(103,"HTML   ",1534.55);  

      System.out.println("Number of Books: " + Book.bookCount);
      b1.showBook();
      b2.showBook();
      b3.showBook(); 
    }
}
