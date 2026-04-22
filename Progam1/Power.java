class Power
{
	public static void main(String [] args)
	{
		System.out.println(power(5,3));
	}
	
	public static int power(int base, int raise)
	{
		int pow = 1;
		for (int i = raise; i != 0 ; i-- )
		{
			pow = pow * base;
		}
		return pow;
	}
}