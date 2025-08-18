package bridgeLabz.corejava;
import java.util.*;
public class vol{
    public static void main (String[]args){
         Scanner sc=new Scanner(System.in);
         double radius=sc.nextDouble();
         double height=sc.nextDouble();
         double r2=radius*radius;
         System.out.print(3.14*r2*height);

         sc.close();
    }
}