import java.util.*;
public class Main {
	enum restaurant {PizzaHut,Dominos,Udupi_upachar;}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = restaurant.values().length;
		int i=0;
		while(i<m)
		{
			System.out.println("Enter your choice: ");
                  System.out.println("1.Pizza Hut");
                  System.out.println("2. Dominos");
                  System.out.println("3. Udupi_Upachar");
			int n = sc.nextInt();
			switch(n)
			{
			case 1: restaurant r1 = restaurant.PizzaHut;
					System.out.println(r1);
					break;
			case 2: restaurant r2 = restaurant.Dominos;
					System.out.println(r2);
					break;
			case 3: restaurant r3 = restaurant.Udupi_upachar;
					System.out.println(r3);
					break;
			default: System.out.println("Invalid choice");
					 break;
			}
			i++;
		}
		
	}

}
