class Narrowing4
{
	public static void main(String []args)
	{
		int a = 1000000000;
		char c1 = (char)a;
		short s1 = (short)a;
		byte b1 = (byte)a ;
		
		System.out.println(a);
		System.out.println(c1);
		System.out.println(s1);
		System.out.println(b1);
		
	}
}