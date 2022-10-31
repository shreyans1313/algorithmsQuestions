import java.util.Scanner;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(solve(N, K));
        }

        sc.close();
    }

    static int solve(int N, int K)
    {
        int r = 0;
        for (int A = 1; A <= N; A++)
         {
            for (int B = A + 1; B <= N; B++) 
            {
                int c = A & B;
                if (c > r && c < K)
                {
                    r = c;
                }
            }
        }
        return r;
    }
}
