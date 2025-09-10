package bridgeLabz.assignment;
class Employee {
    static String companyName = "TechNova Pvt. Ltd.";
    private static int totalEmployees = 0;
    private String name;
    private final int id; // final variable - cannot be reassigned
    private String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id; // final variable initialized once
        this.designation = designation;
        totalEmployees++; // Increment employee count
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("----- Employee Details -----");
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee e2 = new Employee("Bob Smith", 102, "Project Manager");
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
        if (e2 instanceof Employee) {
            System.out.println("e2 is a valid Employee object.");
        }
    }
}