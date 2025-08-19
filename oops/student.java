package bridgeLabz.oops;
class student{
    String name;
    int marks;

    student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    void displayData(){
        System.out.println("Name: "+name+" , Marks: "+marks);
    }

    public static void main (String[]args){
        student s1=new student("abc", 89);
        student s2=new student("xyz", 78);

        s1.displayData();
        s2.displayData();

    }
}
