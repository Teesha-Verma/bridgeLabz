package bridgeLabz.object;
import java.util.*;

class Faculty {
    String name;
    Faculty(String n){ name=n; }
}

class DepartmentU {
    String name;
    DepartmentU(String n){ name=n; }
}

class University {
    String name;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>(); // aggregated
    University(String n){ name=n; }
    void addDepartment(DepartmentU d){ departments.add(d); }
    void addFaculty(Faculty f){ faculties.add(f); }
    void show(){
        System.out.println("University: "+name);
        for(DepartmentU d: departments) System.out.println("Dept: "+d.name);
        for(Faculty f: faculties) System.out.println("Faculty: "+f.name);
    }
    public static void main(String[] args){
        University u = new University("Global Uni");
        Faculty f1 = new Faculty("Prof. Rao");
        u.addDepartment(new DepartmentU("CS"));
        u.addFaculty(f1); // Faculty can exist independently
        u.show();
    }
}
