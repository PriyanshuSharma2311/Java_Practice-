import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        int i;
        for(i=0;i<=n;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int n)
    {    
        int m,digit=0,temp;
        double sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digit=digit+1;
        }
            //System.out.println(digit);
         temp=n;
         while(temp>0)
        {
            m=temp%10;
            sum=sum+(Math.pow(m, digit));
            temp=temp/10;
        }
        if(sum==n)        
        return true;
        else
        return false;        
    }        
}
