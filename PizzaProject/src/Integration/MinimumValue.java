package Integration;

public class MinimumValue {
  
  //creating a min method to search for the smallest value
  public int min(int [] array) {
    int min = array[0];
    
    for(int i=0; i<array.length; i++) {
      if(array[i]<min) {
        min = array[i];
      }
    }
    return min;
  }
}
