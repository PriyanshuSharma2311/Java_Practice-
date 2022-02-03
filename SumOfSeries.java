import java.util.Scanner;
public class SumOfSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        double sum=0;
        double i;
        for(i=1;i<=n;i++)
        {
            sum=sum+1/i;
        }
        System.out.println("Sum of Series= " +sum);
        sc.close();
    }  
}
