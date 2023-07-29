import java.util.*;
public class program4
{
	public static void main(String[] args) 
	{
		Vector fruits = new Vector();
                System.out.println("Vector sucessfully created");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
                System.out.println("Sucessfully inserted");
                System.out.println(fruits);
                fruits.removeElementAt(1);
                System.out.println("Sucessfully removed index 1, i.e.,Orange");
		System.out.println(fruits);
	}
}
