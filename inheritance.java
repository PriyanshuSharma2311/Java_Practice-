class animal
{
    void walk()
    {
        System.out.println("I am Walking");
    }
}
class Bird extends animal
{
    void fly()
    {
        System.out.println("I am Flying");
    }
    void sing()
    {
        System.out.println("I am Singing");
    }
}
public class inheritance 
{
    public static void main(String [] args)
    {
        Bird bird = new Bird();
        bird.fly();
        bird.walk();
        bird.sing();
    }
    
}
