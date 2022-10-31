import java.util.*;

public class twoD_Array_DS
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);

        int a[][]=new int[6][6];

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int sum=-1000;

        for(int i =0 ; i<4;i++)
        {
            for(int j=0 ; j<4; j++)
            {
                int t=a[i][j]+a[i][j+1]+a[i][j+2];
                int m=a[i+1][j+1];
                int b=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(t+m+b>sum)
                {
                    sum=t+m+b;
                }
            }
        }
            System.out.println(sum);

    }
}
