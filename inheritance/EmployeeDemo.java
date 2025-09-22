package bridgeLabz.inheritance;
class Employee {
    String name; int id; double salary;
    Employee(String n,int i,double s){ name=n; id=i; salary=s; }
    void displayDetails(){
        System.out.println("ID:"+id+" Name:"+name+" Salary:"+salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String n,int i,double s,int t){ super(n,i,s); teamSize=t; }
    @Override void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String n,int i,double s,String lang){
        super(n,i,s); programmingLanguage=lang;
    }
    @Override void displayDetails(){
        super.displayDetails();
        System.out.println("Language: "+programmingLanguage);
    }
}

class Intern extends Employee {
    int durationMonths;
    Intern(String n,int i,double s,int d){
        super(n,i,s); durationMonths=d;
    }
    @Override void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: "+durationMonths+" months");
    }
}

public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Manager("Alice",101,90000,5);
        Employee e2 = new Developer("Bob",102,70000,"Java");
        Employee e3 = new Intern("Charlie",103,20000,6);
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
