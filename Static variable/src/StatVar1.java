class StatVar1
{
	static double balance;
	
	public static void main(String [] args)
	{
		printBalance();
		deposit(10000);
		withdraw(2000);
	}
	
	public static void printBalance()
	{
		System.out.println("balance :"+balance);
	}
	
	public static void deposit(double amt)
	{
		if (amt>0)
		{
			balance += amt;
			System.out.println("Amount is credited");
			System.out.println("Your current balance is :"+balance);
		}
		else
		{
			System.out.println("Invalid Amount"); 
		}
	}
	
	public static void withdraw(double amt)
	{
		if (amt>0 && balance >2000)
		{
			balance -= amt;
			System.out.println("Amount is debited");
			System.out.println("Your current balance is :"+balance);
		}
		else
		{
			System.out.println(amt>0 ? "Insufficient Balance":"Invalid Amount"); 
		}
	}
}