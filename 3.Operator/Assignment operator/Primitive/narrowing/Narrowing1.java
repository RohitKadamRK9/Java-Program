class Narrowing1
{
	public static void main(String []args)
	{
		double a = 97.3;
		float f1 = (float)a;
		long l1 = (long)a;
		int i1 = (int)a;
		char c1 = (char)a;
		short s1 = (short)a;
		byte b1 = (byte)a ;
		
		System.out.println(a);
		System.out.println(f1);
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(c1);
		System.out.println(s1);
		System.out.println(b1);
	}
}