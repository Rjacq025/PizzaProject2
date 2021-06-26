package Integration;

import java.util.Scanner;

public class User {

  static Scanner scan = new Scanner(System.in);
  public static String name = scan.nextLine();
  
  // Make a constructor method without parameters
  public User() {
    System.out.println("\n" + "Hello " + name + "!\n");
  }
}
