package bridgeLabz.corejava;
import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double temp_c=sc.nextDouble();
        double temp_f=((temp_c)*9/5)+32;
        System.out.print(temp_f);
        
        sc.close();
    }
}
