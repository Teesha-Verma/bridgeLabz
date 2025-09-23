package bridgeLabz.object;
import java.util.*;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Course(String n){ name=n; }
    void enroll(Student s){ students.add(s); }
    void showStudents(){
        System.out.println("Course: "+name);
        for(Student s: students) System.out.println(" - "+s.name);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String n){ name=n; }
    void addCourse(Course c){ courses.add(c); c.enroll(this); }
    void showCourses(){
        System.out.println(name + "'s courses:");
        for(Course c: courses) System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    School(String n){ name=n; }
    void addStudent(Student s){ students.add(s); }
}

public class SchoolDemo {
    public static void main(String[] args){
        School school = new School("Springfield High");
        Student s1 = new Student("Mia");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        s1.addCourse(c1);
        s1.addCourse(c2);

        s1.showCourses();
        c1.showStudents();
    }
}
