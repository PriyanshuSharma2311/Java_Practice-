import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int n= sc.nextInt();
        int i;
        for(i=0;i<=n;i++)
        {
            CheckPrime(i);
        }
    }
    public static void CheckPrime(int n)
    {
        int m=n/2,i,count=0;
        if(n==0||n==1)
        {

        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    //System.out.println("Prime Number::" +n);
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("Prime Number::" +n);
            }
        }
    }            
}
