
// Richardson Jacques
//This is a combination of my entire COP 2006 skillset.
//This program is a pizza ordering simulator for my Integration Project!

/*
There are eight primitive data types in Java. They are:
 * byte: The byte data type is an 8-bit signed two's complement integer. It has 
 * a minimum value of -128 and a maximum value of 127 (inclusive). The byte 
 * data type can be useful for saving memory in large arrays, where the memory 
 * savings actually matters. They can also be used in place of int where their 
 * limits help to clarify your code; the fact that a variable's range is 
 * limited can serve as a form of documentation.

short: The short data type is a 16-bit signed two's complement integer. It has 
a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with 
byte, the same guidelines apply: you can use a short to save memory in large 
arrays, in situations where the memory savings actually matters.

int: By default, the int data type is a 32-bit signed two's complement integer,
which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 
and later, you can use the int data type to represent an unsigned 32-bit 
integer, which has a minimum value of 0 and a maximum value of 232-1. Use the 
Integer class to use int data type as an unsigned integer. See the section The 
Number Classes for more information. Static methods like compareUnsigned, 
divideUnsigned etc have been added to the Integer class to support the 
arithmetic operations for unsigned integers.

long: The long data type is a 64-bit two's complement integer. The signed long 
has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and 
later, you can use the long data type to represent an unsigned 64-bit long, 
which has a minimum value of 0 and a maximum value of 264-1. Use this data type
when you need a range of values wider than those provided by int. The Long 
class also contains methods like compareUnsigned, divideUnsigned etc to support
arithmetic operations for unsigned long.

float: The float data type is a single-precision 32-bit IEEE 754 floating point.
Its range of values is beyond the scope of this discussion, but is specified in 
the Floating-Point Types, Formats, and Values section of the Java Language 
Specification. As with the recommendations for byte and short, use a float 
(instead of double) if you need to save memory in large arrays of floating 
point numbers. This data type should never be used for precise values, such as 
currency. For that, you will need to use the java.math.BigDecimal class instead.
Numbers and Strings covers BigDecimal and other useful classes provided by the 
Java platform.

double: The double data type is a double-precision 64-bit IEEE 754 floating 
point. Its range of values is beyond the scope of this discussion, but is 
specified in the Floating-Point Types, Formats, and Values section of the Java 
Language Specification. For decimal values, this data type is generally the 
default choice. As mentioned above, this data type should never be used for 
precise values, such as currency.

boolean: The boolean data type has only two possible values: true and false. 
Use this data type for simple flags that track true/false conditions. This data 
type represents one bit of information, but its "size" isn't something that's 
precisely defined.

char: The char data type is a single 16-bit Unicode character. It has a minimum 
value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).


variable: A placeholder in java. Sort of like a box before values are placed 
in it 
scope: A variable is only available in the method where it is defined.

Operator Precedence in Java is the order in which Java programs decide which 
operator to refer to first. Certain operators have more precedence than others.
This also follows the math rule of PEMDAS of course.

Inheritance:

Polymorphism:

*/

package Integration;

import java.util.Scanner;
import java.util.Formatter;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    
    // needed fields
    public static int calorieCount = 0;
    public static double pizzaPrice = 0.00;
    
    

    
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        
        // admittedly i found this when I needed to 
        // limit the doubles to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        
        // Greeting and Introduction
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.println("\n" + "Hello " + name + "! Welcome to Jacques "
                + "Pizzeria, Where our pizza's always match our customer's "
                + "desires" + "\n");
        
        
        //random number generator
        Random customerNum = new Random();        
        System.out.println("You are customer number: " + 
                customerNum.nextInt(500) + " of the day!" + "\n");
        
        System.out.println("Let's start by making a simple pizza!" + "\n");
        
        
        // Crust 
        System.out.println("What kind of crust would you like?");
        System.out.println("\n" + Crust.arrayCrustList[0] + "\n" + 
                            Crust.arrayCrustList[1] + "\n" + 
                            Crust.arrayCrustList[2] + "\n" +
                            Crust.arrayCrustList[3] + "\n" +
                            Crust.arrayCrustList[4] + "\n");
        int crustChoice = scan.nextInt();
        System.out.println(Crust.arrayCrustList[crustChoice - 1]);
        calorieCount += Crust.arrayCrustCalList[crustChoice - 1];
        System.out.println("Calorie count: " + calorieCount + " Calories");
        pizzaPrice += Crust.arrayCrustPriceList[crustChoice - 1];
        
        // Sauce
        System.out.println("\n" + "What kind of sauce would you like?");
        System.out.println("\n" + Sauce.arraySauceList[0] + "\n" +
                            Sauce.arraySauceList[1] + "\n" +
                            Sauce.arraySauceList[2] + "\n" +
                            Sauce.arraySauceList[3] + "\n" +
                            Sauce.arraySauceList[4] + "\n" +
                            Sauce.arraySauceList[5] + "\n");
        int sauceChoice = scan.nextInt();
        System.out.println(Sauce.arraySauceList[sauceChoice - 1]);
        calorieCount += Sauce.arraysauceCalList[sauceChoice - 1];
        System.out.println("Calorie count: " + calorieCount + " calories");
        pizzaPrice += Sauce.arraySaucePriceList[sauceChoice - 1];
        
        // Cheese
        System.out.println("\n" + "What kind of cheese would you like?");
        System.out.println("\n" + Cheese.arrayCheeseList[0] + "\n" +
                            Cheese.arrayCheeseList[1] + "\n" +
                            Cheese.arrayCheeseList[2] + "\n");
        int cheeseChoice = scan.nextInt();
        System.out.println(Cheese.arrayCheeseList[cheeseChoice - 1]);
        calorieCount += Cheese.arrayCheeseCalList[cheeseChoice - 1];
        System.out.println("Calorie count: " + calorieCount + " calories");
        pizzaPrice += Cheese.arrayCheesePriceList[cheeseChoice - 1];
        
        //Meats
        System.out.println("\n" + "What kind of meats would you like?");
        System.out.println("\n" + Meats.arrayMeatList[0] + "\n" + 
                            Meats.arrayMeatList[1] + "\n" +
                            Meats.arrayMeatList[2] + "\n" +
                            Meats.arrayMeatList[3] + "\n" +
                            Meats.arrayMeatList[4] + "\n" +
                            Meats.arrayMeatList[5] + "\n" +
                            Meats.arrayMeatList[6] + "\n" +
                            Meats.arrayMeatList[7] + "\n" +
                            Meats.arrayMeatList[8] + "\n" +
                            Meats.arrayMeatList[9] + "\n" +
                            Meats.arrayMeatList[10] + "\n" +
                            Meats.arrayMeatList[11] + "\n");
        int meatChoice = scan.nextInt();
        System.out.println(Meats.arrayMeatList[meatChoice - 1]);
        calorieCount += Meats.arraymeatCalList[meatChoice - 1];
        System.out.println("Calorie count: " + calorieCount);
        pizzaPrice += Meats.arrayMeatPriceList[meatChoice - 1];
        
        
        //Veggies
        System.out.println("\n" + "What kind of veggies would you like?");
        System.out.println("\n" + Veggies.arrayVeggieList[0] + "\n" + 
                            Veggies.arrayVeggieList[1] + "\n" +
                            Veggies.arrayVeggieList[2] + "\n" +
                            Veggies.arrayVeggieList[3] + "\n" +
                            Veggies.arrayVeggieList[4] + "\n" +
                            Veggies.arrayVeggieList[5] + "\n" +
                            Veggies.arrayVeggieList[6] + "\n" +
                            Veggies.arrayVeggieList[7] + "\n" +
                            Veggies.arrayVeggieList[8] + "\n" +
                            Veggies.arrayVeggieList[9] + "\n");
        int veggieChoice = scan.nextInt();
        System.out.println(Veggies.arrayVeggieList[veggieChoice - 1]);
        calorieCount += Veggies.arrayVeggieCalList[veggieChoice - 1];
        System.out.println("Calorie count: " + calorieCount);
        pizzaPrice += Veggies.arrayVeggiePriceList[veggieChoice - 1];
        
        
        //Final Product Describes the pizza and gives the total Calories
        System.out.println("This is your order: " + "\n" +
                        Crust.arrayCrustList[crustChoice - 1] + "\n" +
                        Sauce.arraySauceList[sauceChoice - 1] + "\n" +
                        Cheese.arrayCheeseList[cheeseChoice - 1] + "\n" +
                        Meats.arrayMeatList[meatChoice - 1] + "\n" +
                        Veggies.arrayVeggieList[veggieChoice - 1]+ "\n");
        System.out.println("Calorie count: " + calorieCount + "\n");
        System.out.println("Price: " + pizzaPrice);
        
        /*
        
        //if the calorie count goes above 400 cal 
        //remind the user of their health
        if (calorieCount <= 400) {
            System.out.println("The general reccommended calorie intake is "
                    + "2,000-2,500 calories per day, so watch your health!");
        } else {
            
        }
        */
        
        
        final double priceTax = pizzaPrice * 0.06;
        final double totalPrice = pizzaPrice + priceTax;
        
        // Receipt totals up the cost of the pizza and other info like day
        System.out.println("\n" + ".......Loading reciept......" + "\n");
        System.out.println("Date: " + "\n");
        System.out.println("Subtotal: $" + nf.format(pizzaPrice));
        System.out.println("Tax: $" + nf.format(priceTax));
        System.out.println("Your total price comes out to: $" 
                            + nf.format(totalPrice));
        
        // Donation final Boolean
        // final in Java means that a variable (or code you are assigning it 
        // to) can only be assigned once
        
        final boolean sealEnding;
        System.out.println("\n" + "Would you like to give a donation to the "
                + "National Seal Foundation? It's just $10!" + "\n" +"Y or N"
                + "\n");
        String sealChoice = scan.next();
        System.out.println(sealChoice);
        
        /*
        if (sealChoice == "Y") {
            System.out.println("Thank you for donating towards our cause");
        } else if (sealChoice == "N") {
            System.out.println("Thank you for giving us your time.");
        } else {
            System.out.println("Please type one of the options above");
        }
        */
        
        
        System.out.println("\n" + "Thank you for eating at Jacques' Pizzeria! "
                + "Have a nice day!");
        
        
    }
    
}


/*
class CalorieCount {
    
}

class Price{
    double crustCost;
    double sauceCost;
    double cheeseCost;
    double meatCost;
    double veggieCost
}
*/
