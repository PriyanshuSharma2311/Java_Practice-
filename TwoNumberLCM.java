import java.util.Scanner;
public class TwoNumberLCM 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int digit1=sc.nextInt();
        System.out.println("Enter the second number");
        int digit2=sc.nextInt();
        CalculateLCM(digit1,digit2);
    }
    public static void CalculateLCM(int n, int m)
    {
        int i,LCM=0,hcf=0;
        for(i=1;i<=n||i<=m;i++)
        {
            if(n%i==0&& m%i==0)
            {
                hcf=i;
            }
        }
        LCM=(n*m)/hcf;
        System.out.println("LCM Of given digits::"+LCM);
    }

    
}
