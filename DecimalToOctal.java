import java.util.Scanner;
public class DecimalToOctal
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n =sc.nextInt();
        ConvertToOctal(n);
    }
    public static void ConvertToOctal(int n)
    {
        int i=0,j;
        int[] a=new int[10];
        while(n>0)
        {
            a[i]=n%8;
            n=n/8;
            i++;
        }
        for(j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
    
}
