
// Richardson Jacques
// This is a combination of my entire COP 2006 skillset.
// This program is a pizza ordering simulator for my Integration Project!

/*
 * There are eight primitive data types in Java. They are: byte: The byte data type is an 8-bit
 * signed two's complement integer. It has a minimum value of -128 and a maximum value of 127
 * (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory
 * savings actually matters. They can also be used in place of int where their limits help to
 * clarify your code; the fact that a variable's range is limited can serve as a form of
 * documentation.
 * 
 * short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of
 * -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you
 * can use a short to save memory in large arrays, in situations where the memory savings actually
 * matters.
 * 
 * int: By default, the int data type is a 32-bit signed two's complement integer, which has a
 * minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int
 * data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum
 * value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the
 * section The Number Classes for more information. Static methods like compareUnsigned,
 * divideUnsigned etc have been added to the Integer class to support the arithmetic operations for
 * unsigned integers.
 * 
 * long: The long data type is a 64-bit two's complement integer. The signed long has a minimum
 * value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data
 * type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of
 * 264-1. Use this data type when you need a range of values wider than those provided by int. The
 * Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic
 * operations for unsigned long.
 * 
 * float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of
 * values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
 * Formats, and Values section of the Java Language Specification. As with the recommendations for
 * byte and short, use a float (instead of double) if you need to save memory in large arrays of
 * floating point numbers. This data type should never be used for precise values, such as currency.
 * For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers
 * BigDecimal and other useful classes provided by the Java platform.
 * 
 * double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of
 * values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
 * Formats, and Values section of the Java Language Specification. For decimal values, this data
 * type is generally the default choice. As mentioned above, this data type should never be used for
 * precise values, such as currency.
 * 
 * boolean: The boolean data type has only two possible values: true and false. Use this data type
 * for simple flags that track true/false conditions. This data type represents one bit of
 * information, but its "size" isn't something that's precisely defined.
 * 
 * char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000'
 * (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 * 
 * 
 * variable: A placeholder in java. Sort of like a box before values are placed in it scope: A
 * variable is only available in the method where it is defined.
 * 
 * Operator Precedence in Java is the order in which Java programs decide which operator to refer to
 * first. Certain operators have more precedence than others. This also follows the math rule of
 * PEMDAS of course.
 * 
 * Inheritance: Inheritance is a relationship between classes in Java (Parent/child, Super/Sub, and
 * Base/Derived) The properties(fields and methods) of a parent/super class is used in child/sub
 * classes that are connected to it.
 * 
 * Polymorphism: Polymorphism uses inheritance as a way to preform different tasks for example a
 * parent class could be animal and two child classes could be dog and cat. If the parent class has
 * a method called animalSound() the subclasses could use this same method to print different
 * statements like "Bark" for the dog class, and "meow" for the cat class.
 * 
 * Casting: Casting in Java is when you assign a value of one primitive data type to another
 * primitive data type
 */

package Integration;

import java.text.NumberFormat;
import java.util.*;

/**
 * This is the driver class that runs the program that gathers the info from the other classes and
 * uses it in turn with the user input to create a pizza.
 * 
 * @author Richardson Jacques
 *
 */
public class Main {

  // needed fields
  public static int calorieCount = 0;
  public static double pizzaPrice = 0.00;
  public static String finalDate;
  private static int locationChoice;
  private static int crustChoice;
  private static int sauceChoice;
  private static int cheeseChoice;
  private static int meatChoice;
  private static int veggieChoice;
  private static String lotteryChoice;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // admittedly i found this when I needed to
    // limit the doubles to 2 decimal places
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);


    // Greeting and Introduction
    // these methods are constructors that have no parameters
    new Greeting();

    System.out.println("Please enter your name: " + "\n");
    new User();

    System.out.println("Please enter the date mm/dd/yyyy: ");
    new Date();


    // Which location to order from use this for creating methods and constructors
    System.out.println("\n" + User.name + " which of our locations would you like to order from"
        + "\n\n" + "Location" + "\t\t\t\t\t" + "Distance From User");

    // Creating new store objects and assigning them to method calls that have arguments
    StoreLocation store1 = new StoreLocation("[1] Jacques Pizzeria Neighborhood Pizzeria", 3);
    System.out.println(store1.getName() + "\t" + store1.getDistance());

    StoreLocation store2 = new StoreLocation("[2] Jacques Pizzeria Restaurant", 7);
    System.out.println(store2.getName() + "\t\t\t" + store2.getDistance());

    StoreLocation store3 = new StoreLocation("[3] Jacques Pizzeria Headquarters", 15);
    System.out.println(store3.getName() + "\t\t" + store3.getDistance());


    // This section of code reccomends the user the closest location
    // It also identifies the index where a value is found
    String[] locNamList = {store1.getName(), store2.getName(), store3.getName()};
    int[] locDistList = {store1.getDistance(), store2.getDistance(), store3.getDistance()};


    MinimumValue m = new MinimumValue();
    // this variable sets the index number meant to be called from the locNamListArray
    int indexName = StoreIndex.findIndex(locDistList, m.min(locDistList));

    System.out.println("\n" + "The location closest to you is " + locNamList[indexName] + ", it is "
        + m.min(locDistList) + " miles away.");


    // blank line for readability
    System.out.println();
    
    boolean inputIsBad = true;

    // inputting a location choice with exception handling
    do {
      try {
        // the locationChoice is influenced by scope declare it as a field or a local variable
        locationChoice = scan.nextInt();
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } 
    } while (inputIsBad);

    
    // Arraylist for reposting the location
    ArrayList<String> locations = new ArrayList<String>();
    locations.add("[1] Jacques Pizzeria Neighborhood Pizzeria");
    locations.add("[2] Jacques Pizzeria Restaurant");
    locations.add("[3] Jacques Pizzeria Headquarters");


    System.out.println("\n" + "Ordering from: " + locations.get(locationChoice - 1));


    // random number generator
    Random customerNum = new Random();
    System.out.println(
        "\n" + "You are customer number: " + customerNum.nextInt(500) + " of the day!" + "\n");

    // using do-while loop to create loading screen
    int counter = 0;
    do {
      System.out.println("Loading......");
      counter++;
    } while (counter <= 5);

    // Start making the pizza
    System.out.println("Let's start by making a simple pizza!" + "\n");



    // Crust
    System.out.println("What kind of crust would you like?" + "\n");
    for (int i = 0; i < Crust.arrayCrustList.length; i++) {
      System.out.println(Crust.arrayCrustList[i]);
    } ;
    
    inputIsBad = true;
    
    do {
      try {
        crustChoice = scan.nextInt();
        System.out.println(Crust.arrayCrustList[crustChoice - 1]);
        calorieCount += Crust.arrayCrustCalList[crustChoice - 1];
        System.out.println("Calorie count: " + calorieCount + " Calories");
        pizzaPrice += Crust.arrayCrustPriceList[crustChoice - 1];
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Input was not part of the choice numbers. Try again.");
        scan.nextLine();
      }
    } while (inputIsBad);
        
    // Sauce
    System.out.println("\n" + "What kind of sauce would you like?" + "\n");
    for (int i = 0; i < Sauce.arraySauceList.length; i++) {
      System.out.println(Sauce.arraySauceList[i]);
    } ;
    
    inputIsBad = true;
    
    do {
      try {
        sauceChoice = scan.nextInt();
        System.out.println(Sauce.arraySauceList[sauceChoice - 1]);
        calorieCount += Sauce.arraysauceCalList[sauceChoice - 1];
        System.out.println("Calorie count: " + calorieCount + "cals");
        pizzaPrice += Sauce.arraySaucePriceList[sauceChoice - 1];
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Input was not part of the choice numbers. Try again.");
        scan.nextLine();
      }
    } while (inputIsBad);
    

    // Cheese
    System.out.println("\n" + "What kind of cheese would you like?" + "\n");
    for (int i = 0; i < Cheese.arrayCheeseList.length; i++) {
      System.out.println(Cheese.arrayCheeseList[i]);
    } ;
    
    inputIsBad = true;
    
    do {
      try {
        cheeseChoice = scan.nextInt();
        System.out.println(Cheese.arrayCheeseList[cheeseChoice - 1]);
        calorieCount += Cheese.arrayCheeseCalList[cheeseChoice - 1];
        System.out.println("Calorie count: " + calorieCount + " cals");
        pizzaPrice += Cheese.arrayCheesePriceList[cheeseChoice - 1];
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Input was not part of the choice numbers. Try again.");
        scan.nextLine();
      }
    } while (inputIsBad);
    

    // Meats
    System.out.println("\n" + "What kind of meats would you like?" + "\n");
    for (int i = 0; i < Meats.arrayMeatList.length; i++) {
      System.out.println(Meats.arrayMeatList[i]);
    } ;
    
    inputIsBad = true;
    
    do {
      try {
        meatChoice = scan.nextInt();
        System.out.println(Meats.arrayMeatList[meatChoice - 1]);
        calorieCount += Meats.arraymeatCalList[meatChoice - 1];
        System.out.println("Calorie count: " + calorieCount + "cals");
        pizzaPrice += Meats.arrayMeatPriceList[meatChoice - 1];
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Input was not part of the choice numbers. Try again.");
        scan.nextLine();
      }
    } while (inputIsBad);
    


    // Veggies
    System.out.println("\n" + "What kind of veggies would you like?" + "\n");
    for (int i = 0; i < Veggies.arrayVeggieList.length; i++) {
      System.out.println(Veggies.arrayVeggieList[i]);
    } ;
    
    inputIsBad = true;
    
    do {
      try {
        veggieChoice = scan.nextInt();
        System.out.println(Veggies.arrayVeggieList[veggieChoice - 1]);
        calorieCount += Veggies.arrayVeggieCalList[veggieChoice - 1];
        System.out.println("Calorie count: " + calorieCount + "cals");
        pizzaPrice += Veggies.arrayVeggiePriceList[veggieChoice - 1];
        inputIsBad = false;
      } catch (InputMismatchException e) {
        System.out.println("Input wasn't an option number. Try again.");
        scan.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Input was not part of the choice numbers. Try again.");
        scan.nextLine();
      }
    } while (inputIsBad);
    


    // Final Product Describes the pizza and gives the total Calories
    System.out
        .println("\n" + "This is your order: " + "\n\n" + Crust.arrayCrustList[crustChoice - 1]
            + "\n" + Sauce.arraySauceList[sauceChoice - 1] + "\n"
            + Cheese.arrayCheeseList[cheeseChoice - 1] + "\n" + Meats.arrayMeatList[meatChoice - 1]
            + "\n" + Veggies.arrayVeggieList[veggieChoice - 1] + "\n");

    int[] arrayFinCal = {Crust.arrayCrustCalList[crustChoice - 1],
        Sauce.arraysauceCalList[sauceChoice - 1], Cheese.arrayCheeseCalList[cheeseChoice - 1],
        Meats.arraymeatCalList[meatChoice - 1], Veggies.arrayVeggieCalList[veggieChoice - 1]};

    // This section of code sums the total of the values in the calorie list array
    int calorieSum = 0;
    for (int calCounter = 0; calCounter < arrayFinCal.length; calCounter++) {
      calorieSum += arrayFinCal[calCounter];
    }

    System.out.println("\n" + "This pizza has a total of " + calorieSum + " calories per slice");

    System.out.println("Price: $" + nf.format(pizzaPrice));

    // Lottery: Use of two-dimensional array and maybe division operator
    System.out.println("\n" + "Would you like to try your luck at our lottery?" + "\n"
        + "If you win you could get your pizza half off! Y/N");

    // the extra scan.nextline makes it possible to scan the next input
    scan.nextLine();

    double lotDiscount;
    

    lotteryChoice = scan.nextLine();
    if (lotteryChoice.equals("Y")) {

      System.out.println("\n" + "Pick a number");

      // Declare, instantiate, initialize and use multidimensional arrays
      int lotMDArray[][] = new int[7][5];
      int i, j, k = 1;

      for (i = 0; i < 7; i++) {
        for (j = 0; j < 5; j++) {
          lotMDArray[i][j] = k;
          k++;
        }
      }

      for (int[] row : lotMDArray) {
        Lottery.printRow(row);
      }

      // switch statement for different responses to different numbers
      String lotteryEnd;
      int lotteryNum = scan.nextInt();

      // Search a two-dimensional array and identify the coordinates where a value was found
      for (int row = 0; row < lotMDArray.length; row++) {
        for (int col = 0; col < lotMDArray[row].length; col++) {
          if (lotMDArray[row][col] == lotteryNum) {
            row += 1;
            col += 1;
            System.out
                .println("You chose " + lotteryNum + " from" + " Row: " + row + " Col: " + col);
          }
        }
      }

      switch (lotteryNum) {
        case 1:
        case 3:
        case 7:
        case 13:
        case 17:
        case 23:
        case 29:
        case 31:
        case 37:
          lotteryEnd = "Win";
          break;
        default:
          lotteryEnd = "Loss";
          break;
      }
      if (lotteryEnd.equals("Win")) {
        System.out.println("You Win!");
        lotDiscount = pizzaPrice / 2;
      } else {
        lotDiscount = 0;
      }
    } else {
      System.out.println("\n" + "You chose not to participate in the lottery." + "\n");
      lotDiscount = 0;
    }



    // final in Java means that a variable (or code you are assigning it
    // to) can only be assigned once


    final double priceTax = pizzaPrice * 0.06;
    double pizzaTip = pizzaPrice * 0.15;
    double roundPizzaTip = Math.ceil(pizzaTip);

    // the extra scan.nextline makes it possible to scan the next input
    scan.nextLine();

    System.out.println("\n" + "Would you like to tip the delivery driver %15? Y/N");
    String tipChoice = scan.nextLine();

    // if statements to determine whether or not to add a tip
    // .equals() statement compares the content of the strings
    // == checks if both objects return the same location of memory
    if (tipChoice.equals("Y")) {

      System.out.println("You have tipped: $" + roundPizzaTip);
    } else {
      pizzaTip = 0.00;
      System.out.println("You didn't tip the driver");
    }


    int pizzaDonate = 10;

    System.out
        .println("\n" + "Would you like to donate to the Jacques Foundation?\nIt's only $10 Y/N");
    String donateChoice = scan.nextLine();


    if (donateChoice.equals("Y")) {
      System.out.println("\n" + "Thank you for donating to our cause!" + "\n");
    } else {
      System.out.println("\n" + "You didn't donate" + "\n");
      pizzaDonate = 0;
    }

    boolean giveBoth = true;

    // use of conditional operator
    if (tipChoice.equals("Y") && donateChoice.equals("Y")) {
      System.out.println("We appreciate your generocity valued customer");
    } else {
      // I'm not typing anything here just using this as a place holder
      giveBoth = false;
      System.out.println();
    }

    // ternary operator using a boolean to determine what kind of spender the user is
    String status = (giveBoth = true) ? "\nSamaritan Status\n" : "\nCustomer Status\n";
    System.out.println(status);

    final double totalPrice = pizzaPrice + priceTax + roundPizzaTip + pizzaDonate - lotDiscount;

    // While loop to show that the program is loading
    System.out.println("\n" + ".......Loading reciept......");
    int loop = 5;
    while (true) {
      System.out.println("loading.........");

      if (loop == 0) {
        // This break statement terminates the loop
        break;
      }
      loop--;
    }

    // Receipt totals up the cost of the pizza and other info like day
    System.out
        .println("\n" + "_____________________Final_Reciept__________________________" + "\n");
    System.out.println("Location: " + locations.get(locationChoice - 1));
    System.out.println("Date: " + finalDate + "\n");
    System.out.println("Subtotal: $" + nf.format(pizzaPrice));
    System.out.println("Tax: $" + nf.format(priceTax));


    System.out.println("Lottery Discount: -$" + nf.format(lotDiscount));
    System.out.println("Tip: $" + nf.format(roundPizzaTip));
    System.out.println("Donation: $" + nf.format(pizzaDonate));

    System.out.println("Your total price comes out to: $" + nf.format(totalPrice));

    System.out.println("\n" + "Thank you for eating at Jacques' Pizzeria! " + "Have a nice day!");
    scan.close();
  }
}
