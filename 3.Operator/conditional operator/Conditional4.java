class Conditional4 
{
	public static void main(String[] args) 
	{
		int n1 = 13;
		int n2 = 75;
		int n3 = 95;
		int n4 = n1>n2 ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3) ; 
		System.out.println("greater no. is : " + n4);
	}
}
