class Factor
{
	public static void main(String[] args)
	{
		factor(9);
	}
	
	public static void factor(int num)
	{
		for (int i = 1; i<=num; i++ )
		{
			if (num%i==0)
			{
				System.out.println("factor of "+num+" is "+i);
			}
		}
	}
}