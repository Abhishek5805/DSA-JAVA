package recursion;

public class printdec {

    public static void printdec1(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n+" ");
        printdec1(n-1);

    }
    public static void main(String[] args) {
        int n =10;
        printdec1(n);
    }
}
