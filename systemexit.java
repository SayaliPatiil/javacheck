import java.util.*;
import java.lang.*;
  
class systemexit
{
    public static void main(String[] args)
    {
      private static final int MAX_NEMBER_OF_REQUEST=5;
        public int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
  
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >=MAX_NEMBER_OF_REQUEST )
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
