class Butterfly
{
	public static void main(String[] args)
	{
		int n = 7;

		for(int i = 0; i < 2*n; i++)
		{
			for(int j = 0; j < 2*n; j++)
			{
				if(i < n)
				{
					if(j <= i || j >= 2*n-i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
				{
					if(j < 2*n-i || j >= i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}