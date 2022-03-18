import java.util.*; 
class Duplicate
{      
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
		int i,j,k;

        int a[] = new int[n];
		int temp[] = new int[n];
        for (i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }   

		for (i=0;i<n-1;i++)
			{
				for (j=0;j<n-1-i; j++)
					{
						if (a[j] > a[j+1])
						{
							k = a[j];
							a[j] = a[j+1];
							a[j+1] = k;
						}
					}
			}
		System.out.println("Unique array");
		for (i = 0,j=0; i < n-1; i++)
        {
			if (a[i+1] != a[i])
			{
				temp[j++] = a[i];
			}
        }
		temp[j++] = a[n-1];
		for (i=0;i<j;i++)
			{
				System.out.print(temp[i] + " ");
			}
		
    }        
}