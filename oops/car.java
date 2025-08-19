package bridgeLabz.oops;
class car{
String model;
int year;

    static int numberOfCars=0;

    car(String model, int year){
        this.model=model;
        this.year=year;
        numberOfCars++;
    }

    void displayDetails(){
        System.out.println("Model: "+model+", Year: "+year);
    }

    

    public static void main(String[]args){
        car car1=new car("Tata", 2017);
        car car2=new car("Audi", 2009);

        car1.displayDetails();
        car2.displayDetails();
    }

}
