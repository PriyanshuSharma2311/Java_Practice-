import java.util.Scanner;
public class DecimalToBinary 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n =sc.nextInt();
        ConvertToBinary(n);
    }
    public static void ConvertToBinary(int n)
    {
        int i=0,j;
        int[] a=new int[100];
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
    
}
