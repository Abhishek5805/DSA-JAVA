package recursion;
public class sum {
    public static int sum1(int n)
    {
        if(n==1)
        {
            
            return 1;
        }
        int fpn=sum1(n-1);
        int fn=n+fpn;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum1(n));
    }
}

