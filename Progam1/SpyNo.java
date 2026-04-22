import java.util.Scanner;
class SpyNo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		
		for(int i = num; i>0 ; i=i/10)
		{
			int ld = i%10;
			sum += ld;
			prod *= ld;
			
		}
		System.out.println("sum of digits : "+sum);
		
		System.out.println("product of digits : "+prod);
		
		if(sum==prod)
		{
			System.out.print(num+" is Spy number");
		}
		else
		{
			System.out.print(num+" is not a Spy number");
		}
	}
}