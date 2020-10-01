/**
 * Example of FINAL Keyword.
 */
class Vehical {
    final public int SPEED_LIMIT = 80;

    final public void Run() {
        System.out.println("Vehical is Running.");
    }

    final public void Break() {
        System.out.println("Vehical Stop.");
    }
}

final class Bike extends Vehical {
    String name, color;
    double price;

    public Bike(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void showData() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Bike b1 = new Bike("Suzuki","Green",70000);
        b1.showData();
        b1.Run();
        b1.Break();

        Bike b2 = new Bike("TVS","Green",70000);
        b2.showData();
        b2.Run();
        b2.Break();
    }
}
