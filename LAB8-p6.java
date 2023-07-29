import java.util.Scanner;

class OutOfRangeException extends Exception {
  public OutOfRangeException(String message) {
    super(message);
  }
}

public class p6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    try {
      if (num < 10 || num > 50) {
        throw new OutOfRangeException("Number is out of range");
      }
      System.out.println("The square of the number is: " + num * num);
    } catch (OutOfRangeException e) {
      System.out.println(e.getMessage());
    }
  }
}

