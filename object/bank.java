package bridgeLabz.object;
import java.util.*;

class Customer {
    String name;
    double balance;
    Customer(String n, double b){ name=n; balance=b; }
    void viewBalance(){
        System.out.println(name + "'s balance: ₹" + balance);
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();
    Bank(String n){ bankName=n; }
    void openAccount(Customer c){
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
    public static void main(String[] args){
        Bank b = new Bank("National Bank");
        Customer c1 = new Customer("Riya", 5000);
        b.openAccount(c1);
        c1.viewBalance();
    }
}
