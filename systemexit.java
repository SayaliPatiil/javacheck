import java.util.*;
import java.lang.*;
  
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
  
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                 logger.info("exit...");
  
                
            }
            else
                logger.info("arr["+i+"] = " +
                                  arr[i]);
        }
         logger.info("End of Program");
    }
}
