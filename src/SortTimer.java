import java.util.Arrays;
import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with any sorting algorithm.
*/
public class SortTimer {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();

      // Construct random array
   
      int[] a = ArrayUtil.randomIntArray(n, 100);
      
      // Use stopwatch to time selection sort
      
      StopWatch timer = new StopWatch();


      //Selection sort

      timer.start();
      SelectionSorter.sort(a);
      timer.stop();
      
      System.out.println("Selection sort time: " + timer.getElapsedTime() + " milliseconds");


      //Standard sort

      timer.start();
      Arrays.sort(a);
      timer.stop();



      System.out.println("Standard time " + timer.getElapsedTime() + " milliseconds");


      //Insert sort

      timer.start();
      InsertionSorter.sort(a);
      timer.stop();

      System.out.println("Insert sort time: " + timer.getElapsedTime() + " milliseconds");


      //Merge sort

      timer.start();
      MergeSorter.sort(a, 0, a.length - 1);
      timer.stop();


      System.out.println("Merge sort Time: " + timer.getElapsedTime() + " milliseconds");



      //Heap sort

      timer.start();
      HeapSorter.sort(a);
      timer.stop();

      System.out.println("Heap sort Time: " + timer.getElapsedTime() + " milliseconds");
   }

}

   
