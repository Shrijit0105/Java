import java.util.Scanner;

public class StringInputDemo {
  public static void main(String[] args){

    System.out.println("input:");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter:");
    String input = scanner.nextLine();
    System.out.println("You entered: " + input);
      
    }
}

