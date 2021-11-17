import java.util.*;
public class basic {
    public static void main (String args[]){ 
    Scanner sc=new Scanner (System.in);
     int z,fact=1;
    System.out.println("Value of x:");
    int x=sc.nextInt();
   
 
    for(z=1;z<=x;z++){
       fact=z*fact;
   }
    System.out.print(""+fact);
    }
    
}



