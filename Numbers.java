import java.util.Scanner;
public class Numbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        String[] arr= new String[20];
        str=sc.nextLine();
        arr=str.split(",");
        int i;
        for(i=1;i<20;i++)
        {
            System.out.println(arr[i]);
        }
        

    } 
    
}
