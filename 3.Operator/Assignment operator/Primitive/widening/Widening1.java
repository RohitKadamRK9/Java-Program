class Widening1
{
	public static void main(String []args)
	{
		byte a = 120 ;
		short s1 = a;
		char c1 = (char)a;
		int i1 = a;
		long l1 = a;
		float f1 = a;
		double d1 = a;
		
		System.out.println(a);
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		
	}
}