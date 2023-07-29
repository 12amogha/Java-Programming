import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter value of c: ");
        int c=sc.nextInt();
        double d = b*b - 4.0*a*c;
        if(d>0.0)
        {
            double r1 = (-b + Math.pow(d,0.5))/(2.0*a);
            double r2 = (-b - Math.pow(d,0.5))/(2.0*a);
            System.out.println("Real Solutions are: " + r1 + ", " + r2);
        }
        else{
            System.out.println("No Real Solutions");
        }

    }
}
