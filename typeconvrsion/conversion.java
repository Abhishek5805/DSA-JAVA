package typeconvrsion;

public class conversion {
    public static void main(String[]args)
    {
        int a=20;
        long b=a;
        System.out.println(b); //sucessfully print the value

        // long c=20;
        // int d=c;
        // System.out.println(c); //give error possible lossy conversion from long to int

        //using type casting
         long number=20;
        int number2=(int) number;
        System.out.println(number2);

        // using character

        char c='a';
        int number3=(int)c;
        System.out.println(number3);


    }
}
