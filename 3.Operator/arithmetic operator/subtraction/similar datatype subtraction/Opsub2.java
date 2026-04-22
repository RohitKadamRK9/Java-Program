class Opsub2
{
	public static void main(String []args)
	{
		short a = 130;
		short b = 340;
		//short c = a - b; //CTE  possible lossy conversion from int to short
		int c = a - b;
		
		System.out.println(c);
		
		
	}
}