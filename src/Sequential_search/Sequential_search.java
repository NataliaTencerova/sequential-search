package Sequential_search;

import java.util.Scanner;
import java.util.Arrays;

public class Sequential_search {
	static Scanner sc = new Scanner(System.in);
  
  public static int[] loadSequence() {
    System.out.print("Insert amount of numbers: ");
    int numbers = sc.nextInt();
    int[] sequence = new int[numbers];
    
    System.out.println("Insert " + numbers + " whole numbers:");
    for (int i = 0; i < sequence.length; i++) {
      sequence[i] = sc.nextInt();
    }
    
    return sequence;
  }  
  
  public static void findAllSequence(int[] sequence, int element) {
    boolean atLeastOne = false;
    
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == element) {
    	  
        if (!atLeastOne) {
          System.out.print(i);
        }
        
        else {
          System.out.print(", " + i);
        }
        
        atLeastOne = true;
      } 
    }
    
    if (!atLeastOne) {
      System.out.println("Element not found.");
    }
    
    else {
      System.out.println();
    }
  }
 
  public static void main(String[] args) {
	
    int[] sequence = loadSequence();
    System.out.print("Insert wanted number: ");    
    int wantedElement = sc.nextInt();
    System.out.println("Index of searched element " + Arrays.toString(sequence) + ": ");
    
    findAllSequence(sequence, wantedElement);    
  }
}   