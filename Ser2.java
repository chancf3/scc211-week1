import java.util.*;
import java.lang.*;

public class Ser2 implements Runnable{
/* clusterMaster calls servers 1-4, and prints the total time taken to complete the entire program.*/
    public void run()
      {
        slaveCall call = new slaveCall();           
        call.server2();
      }
    }