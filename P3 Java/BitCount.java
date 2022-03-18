import java.util.*;

class BitCount
	{
		public static void main(String []args)
		{
			Scanner sc =  new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;
			int temp = n;
			for (int i=1;i<=n;i++)
				{
					temp = i;
					while (temp != 0)
					{
						temp = temp & (temp-1);
						count ++;
					}
				}
			System.out.println(count);
		}
	}