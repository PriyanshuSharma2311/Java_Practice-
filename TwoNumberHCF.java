import java.util.Scanner;
public class TwoNumberHCF 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int digit1=sc.nextInt();
        System.out.println("Enter the second number");
        int digit2=sc.nextInt();
        CalculateHCF(digit1,digit2);
    }
    public static void CalculateHCF(int n,int m)
    {
        int i,hcf=0;
        for(i=1;i<=n||i<=m;i++)
        {
            if(n%i==0&& m%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("HCF of given numbers is::" +hcf);

    }
    
}
