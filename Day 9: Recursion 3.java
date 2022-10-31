import java.util.*;

class Recursion_3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n)
    {
        if(n==0)
        return 1;
        else
        return n*factorial(n-1);
    }
}
