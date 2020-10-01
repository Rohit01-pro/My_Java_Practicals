class Box {
    double length, breath, height;

    public Box() {
        length = 0.0;
        breath = 0.0;
        height = 0.0;
    }

    public Box(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }

    public double volume() {
        return this.length * this.breath * this.height;
    }

    public double surfaceAreaCuboid() {
        return 2 * ((this.length * this.breath) + (this.breath * this.height) + (this.height * this.length));
    }

    public void showData() {
        System.out.println("Length: " + this.length);
        System.out.println("Breath: " + this.breath);
        System.out.println("Height: " + this.height);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Box b1 = new Box(5, 8, 11);
        Box b2 = new Box(4, 7, 12);

        System.out.println("\n### Detail of Box 1 ###");
        b1.showData();
        System.out.println("Volume of Box 1: " + b1.volume());
        System.out.println("Surface Area of Box 1: " + b1.surfaceAreaCuboid());

        System.out.println("\n### Detail of Box 2 ###");
        b2.showData();
        System.out.println("Area of Box 2: " + b2.volume());
        System.out.println("Surface Area of Box 2: " + b2.surfaceAreaCuboid());

    }
}
