package bridgeLabz.inheritance;
class Animal {
    String name;
    int age;
    Animal(String name, int age) { this.name = name; this.age = age; }
    void makeSound() { System.out.println("Generic animal sound"); }
}

class Dog extends Animal {
    Dog(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println(name+" barks: Woof!"); }
}

class Cat extends Animal {
    Cat(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println(name+" meows: Meow!"); }
}

class Bird extends Animal {
    Bird(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println(name+" chirps: Tweet!"); }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Buddy",3), new Cat("Kitty",2), new Bird("Rio",1) };
        for (Animal a : animals) a.makeSound();   // Polymorphism
    }
}
