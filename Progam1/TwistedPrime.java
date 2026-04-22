import java.util.Scanner;
class TwistedPrime
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a fibo number position : ");
		int num = sc.nextInt();
		int den = 2;
		
		while(den<= num/2)
		{
			if(num%den==0)
			{
				System.out.println("it is not prime");
				break;
			}
			den++;
		}
			
		if(den>num/2)
		{
			int temp = num;
			int rev = 0;

			while (temp > 0)
			{
				int d = temp % 10;
				rev = rev * 10 + d;
				temp /= 10;
			}
		}
		
		int deno = 2;
		while(deno<= rev/2)
		{
			if(rev%den==0)
			{
				System.out.println("it is not Twisted prime");
				break;
			}
			deno++;
		}
		
		if(deno>rev/2)
		{
			System.out.println("it is Twisted prime");
		}
	}
}