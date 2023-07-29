import java.util.*;
public class Main 
{
  public static void main(String[] args) 
  {
	 String input1, vowelsString = "", nonVowelsString = "";
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter input1 : Input string");
	 input1 = sc.next();
	 int input2;
	 int input3;
	 input1 = input1.toLowerCase();
	 System.out.println("Enter 0 to print consonents or enter 1 to print vowels");
	 input2 = sc.nextInt();
	 System.out.println("Enter 0 to print in lowercase or enter 1 to print in uppercase");
	 input3 = sc.nextInt();
	 for(int i = 0; i < input1.length(); i++) 
     {
			
	    if(input1.charAt(i) == 'a' || input1.charAt(i) == 'e' || input1.charAt(i) == 'i' || input1.charAt(i) == 'o' || input1.charAt(i) == 'u')
        {
			vowelsString += input1.charAt(i);
		} 
		else 
        {
			nonVowelsString += input1.charAt(i);
		}
	} 
	if(input2 == 0)
	{
		if(input3 == 0)
		{
			System.out.println(nonVowelsString);
		}
		else
        {
			System.out.println(nonVowelsString.toUpperCase());
		}
	}
	else if(input3 == 0)
	{
		System.out.println(vowelsString);
	}
	else
	{
		System.out.println(vowelsString.toUpperCase());
	}
	}
}
