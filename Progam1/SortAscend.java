import java.util.Scanner;
class SortDescend
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println(SortDescend(num));
	}
	
	public static int sorted(int num)
	{
		int sorted = 0;
		for (int i = 0; i<=9; i ++)
		{
			for (int j=num; j!=0; j/=10 )
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