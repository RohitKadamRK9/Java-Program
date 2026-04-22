import java.util.Scanner;
class SortDescend
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number less than 21748473647 :");
		int num = sc.nextInt();
		System.out.println(sorted(num));
	}
	
	public static int sorted(int num)
	{
		int sorted = 0;
		for (int i = 9; i>0; i --)
		{
			for (int j=num; j>0; j/=10 )
			{
				int last = j%10;
				if(last==i)
				{
					sorted = sorted*10+i;
				}
			}
		}
		return sorted;
	}
}