class Frequency
{
	public static void main(String [] args) 
	{
		frequency(123423458);
	}
	
	public static void frequency(int num) 
	{
		
		for(int i = 0; i<9; i++)
		{
			int cnt = 0;
			for (int j = num; j!=0 ; j/=10 )
			{
				int last = j%10;
				if(last == i)
				{
					cnt++;
				}
			}
			
			if (cnt!=0)
				{
					System.out.println("Count of "+i+" is "+cnt); 
				}
			 
		}
	}
}