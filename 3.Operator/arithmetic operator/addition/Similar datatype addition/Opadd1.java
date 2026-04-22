class Opadd1
{
	public static void main(String []args)
	{
		byte a = 12;
		byte b = 34;
		//byte c = a + b; //CTE  possible lossy conversion from int to byte
		int c = a + b;
		
		System.out.println(c);
		
		
	}
}