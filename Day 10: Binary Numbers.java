import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        long result=0; 
        long count=0;
        long n=in.nextLong();
        long l=1;
        long N=n;
        long r=0;
        long d;
        long re=0;
        while(N>0)
        {
            d=N%2;
            r=r*10+d;
            N=N/2;
        }
        
        for(long i=r;i>0;i=i/10)
        {
            d=i%10;
            re=re*10+d;
        }
        r=re;
         while(r>0)
        {
            d=r%10;
            if (d == 0) 
                count = 0; 
      
            else
            { 
                count++;
                result = Math.max(result, count); 
            }
            r=r/10; 
        }
        System.out.println(result);
    }
}
