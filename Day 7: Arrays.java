import java.util.*;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int a[]=new int[n];
        int i=0;
        while(i<n)
        {
            a[i++]=in.nextInt();
        }
        i--;
        while(i>=0)
        {
            System.out.print(a[i--]+" ");
        }
    }
}
