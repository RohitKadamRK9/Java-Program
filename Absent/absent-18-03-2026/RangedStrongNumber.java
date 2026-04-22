import java.util.Scanner;
class RangedStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting number : ");
		int start = sc.nextInt();
		
		System.out.println("Enter a Ending number : ");
		int end = sc.nextInt();
		
		while (start <= end)
		{
			int sum = 0 ;
			for (int i = start; i!=0 ; i/=10 )
			{
				int last = i%10;
				int fact = 1;
				while (last>1)
				{
					fact *= last;
					last--;
				}
				sum += fact;
			}
			if (sum == start)
			{
				System.out.print(start+" ");
			}
			start++;
		}
		
	}
}
