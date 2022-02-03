import java.util.Scanner;
public class Tables 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        System.out.println("*********");
        int i,j;
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=10;j++)
            {
                System.out.println(i*j);
            }
            System.out.println("*************");
        }
        
        
        

    }   
}
