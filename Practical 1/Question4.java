class Book {
    int id;
    String name;
    double price;

    public Book(){
        this.id = 0;
        this.name = "";
        this.price = 0.0;
    }
    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showData() {
        System.out.println(this.id + "  " + this.name + "  " + this.price);
    }
}

public class Question4 {
    public static void main(String args[]) {
        Book b1 = new Book(101,"Java",566.33);
        Book b2 = new Book(102,"Python",346.33); 
        
        b1.showData();
        b2.showData();
    }
}
