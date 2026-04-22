import java.util.Scanner;

class Ifstatement  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your bill amount :");
		double bill = sc.nextDouble();
		
		if (bill > 500)
		{
			bill = bill - (bill * 0.2);
			 System.out.println("Discount applied !");
		}
		System.out.println("Your final bill is :"+ bill);
	}
}
