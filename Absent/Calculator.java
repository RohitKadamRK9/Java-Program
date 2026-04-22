import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// infinite loop 
		for(; ;){
		System.out.println("\n ******** Welcome *********");
		
		System.out.print("Enter the first operand : ");
		double operand1 = sc.nextDouble();
		
		System.out.print("Enter the operator : ");
		char operator = sc.next().charAt(0);
		
		System.out.print("Enter the second operand : ");
		double operand2 = sc.nextDouble();
		
		double output = 0;
		
		output =(operator == '+')?
		(output =operand1 + operand2):
		((operator == '-')?(operand1 - operand2):
		((operator == '*')?(operand1 * operand2):
		((operator == '/')?(operand1 / operand2):
		((operator == '%')?(operand1 % operand2):
		(Double.MAX_VALUE)))));
		
		System.out.println();
		if(output == Double.MAX_VALUE)
		{
			System.out.println("/nINVALID OPERATOR/n");
		}
		else{
		System.out.println(operand1+" "+operator+" "+operand2+ " = "+ String.format("%.3f",output));
		}
		
		}
	}
}
