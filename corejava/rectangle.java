package bridgeLabz.corejava;
import java.util.*;
public class rectangle{
    public static void main (String[]args){
         Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.print(2*(length+height));

         sc.close();
    }
}