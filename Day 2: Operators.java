import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        double mealCost=in.nextDouble();
        int tipPercent=in.nextInt();
        int taxPercent=in.nextInt();

        System.out.println(Math.round(mealCost+(mealCost*(tipPercent/100))+(mealCost*((double)taxPercent/100))));
        
    }
}


