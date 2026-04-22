import java.util.Scanner;
class  PowerFuction
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();
		
		System.out.print("Enter the Power : ");
		double power = sc.nextDouble();
		
		if (power < 0)
		{
			power *= -1 ;
			num = 1/num ;
		}
		double output = 1;
		for (int i = 1; i<= power ; i++ )
		{
		   output *= num;
		}
		// comparison between Math.pow() and our implementation .
		System.out.println("\n Math.pow : "+Math.pow(num, power));
		System.out.println("Our implementation : "+output);
	}
}
