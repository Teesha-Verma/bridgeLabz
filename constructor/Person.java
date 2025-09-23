package bridgeLabz.constructor;
public class Person {
    String name;
    int age;

    Person(String n, int a) { name = n; age = a; }
    // copy constructor
    Person(Person p) { name = p.name; age = p.age; }

    public static void main(String[] args) {
        Person p1 = new Person("Teesha",20);
        Person p2 = new Person(p1);
        System.out.println(p2.name + " " + p2.age);
    }
}
