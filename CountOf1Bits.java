import java.util.*; 
class CountOf1Bits 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int x, n; 
		long ans = 0; 
		n = sc.nextInt(); 
		ans = 0; 
		for(int i=1; i<=n; i++)
		{ 
			x=i; 
			while(x>0) 
			{
				x=x&(x-1); 
				ans++; 
			}
		} 
		System.out.println(ans); 
	}
}