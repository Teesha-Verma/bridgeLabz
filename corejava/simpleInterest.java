package bridgeLabz.corejava;
import java.util.*;
public class simpleInterest{
    public static void main (String[]args){
         Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();

        double interest=(principal*rate*time)/100;
        System.out.print(interest);

         sc.close();
    }
}