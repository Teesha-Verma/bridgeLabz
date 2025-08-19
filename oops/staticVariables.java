package bridgeLabz.oops;
class cartest{
String model;
int year;

    static int numberOfCars=0;

    cartest(String model, int year){
        this.model=model;
        this.year=year;
        numberOfCars++;
    }

    void displayDetails(){
        System.out.println("Model: "+model+", Year: "+year);
    }

    

    public static void main(String[]args){
        cartest car1=new cartest("Tata", 2017);
        cartest car2=new cartest("Audi", 2009);

        car1.displayDetails();
        car2.displayDetails();

        System.out.print(numberOfCars);
    }

}
