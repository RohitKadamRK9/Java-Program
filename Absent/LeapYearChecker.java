import java.util.Scanner;

class LeapYearChecker 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the year you want to check for leap year :");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("yes, it is a leap year .");
		}
		else{
			System.out.println("No it is not a leap year.");
		}
	}
}
