import java.util.*;
import java.lang.*;
  
class GfG
{
    public static void main(String[] args)
    {
      private static final int MAX_NEMBER_OF _REQUEST=5;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
  
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >=MAX_NEMBER_OF _REQUEST )
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
