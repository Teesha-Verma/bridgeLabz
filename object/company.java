package bridgeLabz.object;
import java.util.*;

class Employee {
    String name;
    Employee(String n){ name=n; }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String d){ deptName=d; }
    void addEmployee(Employee e){ employees.add(e); }
    void showEmployees(){
        System.out.println("Department: " + deptName);
        for(Employee e: employees) System.out.println("  - " + e.name);
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String n){ name=n; }
    void addDepartment(Department d){ departments.add(d); }
    void show(){
        System.out.println("Company: " + name);
        for(Department d: departments) d.showEmployees();
    }
    public static void main(String[] args){
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Amit"));
        dev.addEmployee(new Employee("Sara"));
        comp.addDepartment(dev);
        comp.show();
        // When comp object is discarded, departments & employees are too.
    }
}
