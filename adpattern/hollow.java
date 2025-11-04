package adpattern;

public class hollow {
    public static void hollow_pttern(int totalrow, int totalcol)
    {
        for(int i=1;i<=totalrow;i++)
        {
            for(int j=1;j<=totalcol;j++)
            {
                if(i==1||i==totalrow||j==1||j==totalcol)
                {

                
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_pttern(4, 5);
    }
}
