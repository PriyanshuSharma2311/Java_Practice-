import java.util.Scanner;
public class SecondLowestNumber 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third number");
        int c = sc.nextInt();
        FindSecondLowest(a,b,c);
    }
    public static void FindSecondLowest(int a, int b, int c)
    {
        int great,small,middle=0;
        great=CheckGreat(a, b, c);
        small=CheckSmall(a, b, c);
        if(great==a&&small==b)
        {
            middle=c;
        }
        if(great==b&&small==a)
        {
            middle=c;
        }
        if(great==a&&small==c)
        {
            middle=b;
        }
        if(great==c&&small==a)
        {
            middle=b;
        }
        if(great==b&&small==c)
        {
            middle=a;
        }
        if(great==c&&small==b)
        {
            middle=a;
        }
        System.out.println("Second lowest number is " +middle);
    }
    public static int CheckGreat(int a,int b,int c)
    {
        int great;
        if(a>b&&a>c)
        {
            great=a;
            return great;
        }
        if(b>a&&b>c)
        {
            great=b;
            return great;
        }
        else
        {
            great=c;
            return great;
        }
    }
    public static int CheckSmall(int a,int b, int c)
    {
        int small;
        if(a<b&&a<c)
        {
            small=a;
            return small;
        }
        if(b<a&&b<c)
        {
            small=b;
            return small;
        }
        else
        {
            small=c;
            return small;
        }
    }
    
}
