import java.util.*;

class Manipulation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		int a,b;
		String st;
		int count = 0;
		System.out.println("Enter a string :");
		st = sc.nextLine();
		st = st.toLowerCase();
		b = st.length();
		for (a=0;a<b;a++)
		{
			ch = st.charAt(a);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch  == 'o' || ch == 'u')
			{
				count ++;
			}
		}
		System.out.println("The number of vowels : " + count);
	}
}