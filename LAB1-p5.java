abstract class shape
{
    int a, b;
    abstract void printArea();
}
public class Main extends shape
{
    
    void printArea()
    {
        System.out.println("I am printing");
    }
    public static void main(String args[])
    {
       Main obj = new Main();
        obj.printArea();
    }
}
