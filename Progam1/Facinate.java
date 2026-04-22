class Facinate
{
	public static void main(String [] args)
	{
		int num = 192 ;
		int temp = 0;
		int a = 0;
		if(count(num)==3)
		{
			for(int i = 1; i<=3; i++,temp*=1000)
			{
				a = num*i;
				temp += a;
			}
			System.out.println(temp);
		}
		
	}
	
	public static int count(int num)
	{
		int cnt = 0;
		for(int i = num; i >0;i/=10)
		{
			cnt++ ;
		}
		return cnt;
	}
}