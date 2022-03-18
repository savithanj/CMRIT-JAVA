d// Write a Java program to cyclically rotate a given array clockwise by one
import java.util.*; 
class Rotate 
{
	public static void main(String[] args) 
	{ 
		int size;
		Scanner sc = new Scanner (System.in);
		size = sc.nextInt();

		int arra[] = new int[size];
		for (int i=0;i<size;i++)
		{
			arra[i] = sc.nextInt();
		}
		int a = arra[arra.length-1]; 
		for (int i = arra.length-1; i > 0; i--) 
		{
			arra[i] = arra[i-1];
		}
		arra[0] = a;

		for(int i=0;i<arra.length;i++)
			System.out.print(arra[i] + " ");
 	} 
}