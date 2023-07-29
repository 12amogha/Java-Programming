
import java.util.*;
public class Main {
  public static void main(String[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException("Two numbers are required");
    }
    Scanner sc = new Scanner(System.in);
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    try {
      int result = num1 / num2;
      System.out.println("The result of the division is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }
}
