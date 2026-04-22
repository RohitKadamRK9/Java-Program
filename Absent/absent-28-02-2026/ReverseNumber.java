import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int reverse = 0;
		
		for (int i = num; i>0 ; i/=10 )
		{
			int ld = i %10;
			reverse = reverse*10 +ld ;
		}
		System.out.print(reverse);
	}
}
 