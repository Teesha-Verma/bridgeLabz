package bridgeLabz.inheritance;
interface Worker {
    void performDuties();
}

class Person {
    String name; int id;
    Person(String n,int i){ name=n; id=i; }
}

class Chef extends Person implements Worker {
    Chef(String n,int i){ super(n,i); }
    public void performDuties(){ System.out.println(name+" cooks meals."); }
}

class Waiter extends Person implements Worker {
    Waiter(String n,int i){ super(n,i); }
    public void performDuties(){ System.out.println(name+" serves customers."); }
}

public class RestaurantDemo {
    public static void main(String[] args){
        Worker w1 = new Chef("Arjun",1);
        Worker w2 = new Waiter("Maya",2);
        w1.performDuties();
        w2.performDuties();
    }
}
