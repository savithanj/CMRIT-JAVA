// Program to find the minimum and maximum element in an array of integers
import java.util.*;

public class min
{
    public static void main (String args[])
    {
		Scanner sc = new Scanner (System.in);
		
		// Accept the size of the array
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();

		// Declare an array of size n
		int a[] = new int [n];
		
        // Accept n elements into the array
		System.out.println("Enter " + n + " integers : ");
		for (int i = 0; i < n; i++)
			{
				a[i] = sc.nextInt();
			}
		// let first element of the array be the minimum and maximum element
        int min = a[0];
		int max = a[0];
		
        int minpos=0;
        int maxpos=0;
		
        for (int i = 0;i < n ;i++)
        {
            if(a[i] < min)
            {
                min = a[i];
                minpos = i;
            }
            if (a[i] > max)
            {
                max = a[i];
                maxpos = i;
            }
        }
        System.out.println("The minimum number is = " + min + " at position " + (minpos+1));
        System.out.println("The maximum number is = " + max + " at position " + (maxpos+1)); 
    }
}