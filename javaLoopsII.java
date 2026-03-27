import java.util.*;
class Solution 
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int current_term = a;
            for(int j = 0; j < n; j++) 
            {
                current_term += (int)Math.pow(2, j) * b; 
                System.out.print(current_term + " ");
            }
            System.out.println(); 
        }
        in.close();
    }
}
