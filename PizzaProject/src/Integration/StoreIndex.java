package Integration;

import java.util.*;

public class StoreIndex {

  //Searching an array and identifying the index where it is found
  // this will be used to find the name of the store with the shortest distance of the user
  public static int findIndex(int arr[], int t) {
    
    int len = arr.length;
    int i = 0;
    
    while(i < len) {
      
      if (arr[i] == t) {
        return i;
      } else {
        i += 1;
      }
    }
    return -1;
  }
}
