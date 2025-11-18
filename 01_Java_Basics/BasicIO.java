import java.util.Scanner;
public class BasicIO {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Displaying output
        System.out.println("--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
  }
}

