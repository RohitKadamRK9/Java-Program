class Widening6
{
	public static void main(String []args)
	{
		float a = 22.2f; // if f not given : possible lossy conversion from double to float
		double d1 = a;
		
		System.out.println(a);
		System.out.println(d1);
		
	}
}