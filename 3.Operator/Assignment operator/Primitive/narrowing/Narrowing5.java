class Narrowing5
{
	public static void main(String []args)
	{
		char a = 'r';
		short s1 = (short)a;
		byte b1 = (byte)a ;
		
		System.out.println(a);
		System.out.println(s1);
		System.out.println(b1);
		
	}
}