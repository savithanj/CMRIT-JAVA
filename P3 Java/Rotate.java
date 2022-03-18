import java.util.*;

class Rotate
	{
		public static void main(String args[])
		{
			int i;
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int arr[ ] = new int [n];
			for(i=0;i<n;i++)
				{
					arr[i] = sc.nextInt();
				}
			int last = arr[n-1];
			for (i=n-1;i>0;i--)
				{
					arr[i] = arr[i-1];
				}
			arr[i] = last;
			for (i=0;i<n;i++)
				{
					System.out.print(arr[i] + " ");
				}
		}	
	}