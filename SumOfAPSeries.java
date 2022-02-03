import java.util.Scanner;
public class SumOfAPSeries 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Starting point of AP");
        int SP=sc.nextInt();
        System.out.println("Enter the no of items in  AP");
        int items=sc.nextInt();
        System.out.println("Enter the Common Difference in AP");
        int CD=sc.nextInt();
        SumOfAP(SP,items,CD);
    }
    public static void SumOfAP(int SP,int items, int CD)
    {
        int i,sum=0;
        for(i=1;i<=items;i++)
        {
            sum=sum+SP;
            SP+=CD;
        }
        System.out.println("Sum of the given AP Series is :: "+sum);
    }
    
}
