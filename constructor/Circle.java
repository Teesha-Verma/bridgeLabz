package bridgeLabz.constructor;
public class Circle {
    double radius;

    Circle() {
        this(1.0);        // calls parameterized constructor
    }
    Circle(double r) {
        radius = r;
    }
    double area() { return Math.PI * radius * radius; }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        System.out.println("Default area: " + c1.area());
        System.out.println("Area with radius 5: " + c2.area());
    }
}
