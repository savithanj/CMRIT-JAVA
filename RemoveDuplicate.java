import java.util.*;
class RemoveDuplicate
{      
    public static void main(String[] args) 
    {
		int size;
		Scanner sc = new Scanner (System.in);
		size = sc.nextInt();

		int arrayWithDuplicates[] = new int[size];
		for (int i=0;i<size;i++)
		{
			arrayWithDuplicates[i] = sc.nextInt();
		}               
        int noOfUniqueElements = arrayWithDuplicates.length;
		for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {                
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {                           
        			arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];                                     
                    noOfUniqueElements--;                                       
                    j--;
                }
            }
        }
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i] + " ");
        }                                
		System.out.println();
    }        
}