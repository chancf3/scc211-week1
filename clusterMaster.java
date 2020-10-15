import java.util.*;
import java.lang.*;

public class clusterMaster{
/* clusterMaster calls servers 1-4, and prints the total time taken to complete the entire program.*/
      public static void main (String arg[]) { 
      long startTime = System.currentTimeMillis();
      Thread tr1 = new Thread(new Ser1());
      Thread tr2 = new Thread(new Ser2());
      Thread tr3 = new Thread(new Ser3());
      Thread tr4 = new Thread(new Ser4());
      tr1.start();
      tr2.start();
      tr3.start();
      tr4.start();
      long endTime = System.currentTimeMillis();
      System.out.println("Threads took " + (endTime - startTime) + " milliseconds to complete");
      
	}
	
}