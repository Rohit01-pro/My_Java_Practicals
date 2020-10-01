/**
 * Example of THIS Keyword.
 */
class Student {
    protected int roll;
    protected String name;

    public Student() {
        this.roll = 0;
        this.name = "";
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return this.roll;
    }

    public String getName() {
        return this.name;
    }

    public void showData() {
        System.out.println(this.roll + "       " + this.name);
    }

    public void showDataUsingfunc() {
        System.out.println(this.getRoll() + "       " + this.getName());
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rohit Kanojiya");
        Student s2 = new Student(102, "Pardeep Narwal");
        Student s3 = new Student(103, "Rampal Chauhan");

        System.out.println("\n### Student Detail ###\n");
        System.out.println("Roll No   Name ");
        s1.showData();
        s2.showDataUsingfunc();
        s3.showData();

    }
}
