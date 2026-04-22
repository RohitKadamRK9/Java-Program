import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0 ;
		
		for (int i=num ; i!=0 ; i/=10 )
		{
			int last = i%10 ;
			int fact = 1 ;
			while (last > 1)
			{
				fact *=last;
				last--;
			}
			sum += fact;
		}
		if (sum == num)
		{
			System.out.println("Its a Strong number .");
		}else{
			System.out.println("Its not a Strong number .");
		}
		
	}
}
