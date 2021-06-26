package Integration;

import java.util.ArrayList;

public class StoreLocation {
  // this is encapsulation it hides the variables from being accessed
  // in other classes
  private String name;
  private int distance;

  // Make a constructor method with parameters
  //the header is the public StoreLocation
  // the parameters are in the (parenthesis)
  public StoreLocation(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  // Getter methods
  public String getName() {
    return name;
  }

  public int getDistance() {
    return distance;
  }


  // the keyword this refers to the variable int the class/object that is being used
  // use 'this' to pick out an instance variable
  // Setter methods
  public void setName(String Name) {
    this.name = Name;
  }

  public void setDistance(int Distance) {
    this.distance = Distance;
  }
 
}
