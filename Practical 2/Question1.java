class Employee {
    int eid;
    String ename;
    double esalary;

    public Employee(){
        eid = 0;
        ename = "";
        esalary = 0.0;
    }
    public Employee(int id, String name, double salary) {
        eid = id;
        ename = name;
        esalary = salary;
    }

    public void addSalary(double sal) {
        this.esalary += sal;
    }

    public void showData() {
        System.out.println(this.eid + "          " + this.ename + "     " + this.esalary);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rohit Kanojiya", 45000.00);
        Employee e2 = new Employee(102, "Monu Gupta", 52000.00);
        Employee e3 = new Employee(103, "Rohit Gupta", 51000.00);
        Employee e4 = new Employee(104, "Rampal Chauhan", 48000.00);
        Employee e5 = new Employee(105, "Dhruv Mistry", 49000.00);


        e1.addSalary(4000);
        e2.addSalary(1000);
        e3.addSalary(500);
        e4.addSalary(2000);
        e4.addSalary(1000);

        System.out.println("Employee ID  Employee Name   Employee Salary");
        e1.showData();
        e2.showData();
        e3.showData();
        e4.showData();
        e5.showData();
    }
}