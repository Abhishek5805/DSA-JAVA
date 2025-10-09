package recursion;

public class printinc {

    public static void printinc1(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        
        printinc1(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n =10;
        printinc1(n);
    }
}
