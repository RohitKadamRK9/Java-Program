import java.util.Scanner;
class Fibonacci
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a ending number : ");
		int end = sc.nextInt();
		
		int n1 = 0, n2 = 1, ans;
		
		for(int i = 0 ; i<end ; i++)
		{
			ans = n1+n2;
			System.out.print(n1+" ");
			n1 = n2;
			n2 =ans;
		}
	}
}