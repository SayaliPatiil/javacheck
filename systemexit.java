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
                System.out.println("exit...");
  
                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                                  arr[i]);
        }
        System.out.println("End of Program");
    }
}
