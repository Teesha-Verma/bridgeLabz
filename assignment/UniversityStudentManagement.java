package bridgeLabz.assignment;
class Student {
    static String universityName = "Global Tech University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber; // final variable - unique ID
    private String grade;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber; // final variable initialized here
        this.grade = grade;
        totalStudents++; // Increment student count
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " (Roll: " + rollNumber + ")");
        } else {
            System.out.println("Invalid Student object. Cannot update grade.");
        }
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("----- Student Details -----");
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Not a valid Student object.");
        }
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s2.updateGrade("A+");
        s2.displayStudentDetails();
        Student.displayTotalStudents();
        if (s1 instanceof Student) {
            System.out.println("s1 is a valid Student object.");
        }
    }
}