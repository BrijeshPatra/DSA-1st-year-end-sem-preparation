package assignment2;

class Persons {
    String name;
    int age;

    // Constructor to initialize name and age
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Persons {
    int Eid;
    double salary;

    // Constructor to initialize name, age, Eid, and salary
    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    // Method to display employee details
    public void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: $" + salary);
    }
}

public class A2Q5 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, 1001, 50000);

        // Display employee details
        employee.empDisplay();
    }
}
