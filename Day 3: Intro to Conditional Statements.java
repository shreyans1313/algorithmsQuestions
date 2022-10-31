import java.util.*;

class Day_3_Intro_to_Conditional_Statements
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        if(n%2!=0) 
        System.out.println("Weird");
        else
        {
            if(n>=2&&n<=5)
            System.out.println("Not Weird");

            if(n>=6&&n<=20)
            System.out.println("Weird");

            if(n>20)
            System.out.println("Not Weird");
        }
    }
}
