package Integration;

import java.util.Scanner;

public class Date {

  

  //constructor method
  public Date() {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the month number:");
    int month = scan.nextInt();
    
    System.out.println("\n"+"Enter the day number:");
    int day = scan.nextInt();
    
    System.out.println("\n"+"Enter the year number:");
    int year = scan.nextInt();
    
    //Using switch statement to set the month of the purchase
    String monthString;
    switch (month) {
      case 1:
        monthString = "January";
        break;

      case 2:
        monthString = "February";
        break;

      case 3:
        monthString = "March";
        break;

      case 4:
        monthString = "April";
        break;

      case 5:
        monthString = "May";
        break;

      case 6:
        monthString = "June";
        break;

      case 7:
        monthString = "July";
        break;

      case 8:
        monthString = "August";
        break;

      case 9:
        monthString = "September";
        break;

      case 10:
        monthString = "October";
        break;

      case 11:
        monthString = "November";
        break;

      case 12:
        monthString = "December";
        break;

      default:
        monthString = "Invalid month";
        break;
    }
    
    String recieptDate = monthString + " " + day + ", " + year;
    //Variable can be called from main class and reassigned here
    Main.finalDate = recieptDate;
    
    System.out.println("\n"+"Date of order: " + recieptDate);
  }
  
  
}

