package bridgeLabz.corejava;
import java.util.*;
public class power{
    public static void main (String[]args){
         Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double expo=sc.nextDouble();
        double result= Math.pow(base , expo);
        System.out.print(result);

         sc.close();
    }
}