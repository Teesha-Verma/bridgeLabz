package bridgeLabz.inheritance;
class BankAccount {
    String accountNumber; double balance;
    BankAccount(String a,double b){ accountNumber=a; balance=b; }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String a,double b,double r){ super(a,b); interestRate=r; }
    void displayAccountType(){ System.out.println("Savings Account with interest "+interestRate+"%"); }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String a,double b,double w){ super(a,b); withdrawalLimit=w; }
    void displayAccountType(){ System.out.println("Checking Account with limit "+withdrawalLimit); }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    FixedDepositAccount(String a,double b,int m){ super(a,b); maturityPeriod=m; }
    void displayAccountType(){ System.out.println("Fixed Deposit for "+maturityPeriod+" months"); }
}

public class BankDemo {
    public static void main(String[] args){
        new SavingsAccount("S123",5000,4.5).displayAccountType();
        new CheckingAccount("C123",3000,1000).displayAccountType();
        new FixedDepositAccount("F123",10000,12).displayAccountType();
    }
}
