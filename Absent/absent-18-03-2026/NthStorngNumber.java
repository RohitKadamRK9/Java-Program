 import java.util.Scanner;
class NthStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number : ");
		int num = sc.nextInt();
		
		int ct = 0 ;
		
		for (int j = 1;  ; j++ )
		{
			int sum = 0 ;
			for (int i = j; i!=0 ; i/=10 )
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
			if (sum == j)
			{
				ct++;
				if (ct == num)
				{
					System.out.print(j);
					break;
				}
				
			}
		}
		
	}
}
