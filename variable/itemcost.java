package variable;

import java.util.Scanner;

public class itemcost {
    public static void main(String []args)
 {
    Scanner sc=new Scanner(System.in);
    float pen=sc.nextFloat();
    float pencil=sc.nextFloat();
    float scale=sc.nextFloat();
    float totalcost=(pen+pencil+scale);


    System.out.println(totalcost);

 }   
}
