import java.util.*;
import java.lang.*;
  
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        private static final int MAX_NUMBER_OF_REQUESTS = 5;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >=  MAX_NUMBER_OF_REQUESTS)
            {
                 logger.info("exit...");
  
                
            }
            else
                logger.info("arr["+i+"] = " +
                                  arr[i]);
        }
         logger.info("End of Program");
    }
 
  public void printMessage(int month)
  {
    switch (month)
    {

      case 1: print("January");
        break;
      case 2: print("February");
        break;
    }
    println(" is a great month");
  }


}
