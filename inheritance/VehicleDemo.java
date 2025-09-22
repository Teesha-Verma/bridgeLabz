package bridgeLabz.inheritance;
class Vehicle {
    int maxSpeed; String fuelType;
    Vehicle(int m,String f){ maxSpeed=m; fuelType=f; }
    void displayInfo(){
        System.out.println("Speed:"+maxSpeed+"km/h Fuel:"+fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    Car(int m,String f,int s){ super(m,f); seatCapacity=s; }
    @Override void displayInfo(){
        super.displayInfo();
        System.out.println("Seats:"+seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;
    Truck(int m,String f,double l){ super(m,f); loadCapacity=l; }
    @Override void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity:"+loadCapacity+" tons");
    }
}

class Motorcycle extends Vehicle {
    String type;
    Motorcycle(int m,String f,String t){ super(m,f); type=t; }
    @Override void displayInfo(){
        super.displayInfo();
        System.out.println("Type:"+type);
    }
}

public class VehicleDemo {
    public static void main(String[] args){
        Vehicle[] list = {
            new Car(180,"Petrol",5),
            new Truck(120,"Diesel",10),
            new Motorcycle(150,"Petrol","Sport")
        };
        for(Vehicle v:list) v.displayInfo();  // polymorphic call
    }
}
