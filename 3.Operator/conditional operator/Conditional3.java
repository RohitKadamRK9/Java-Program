class Conditional3 
{
	public static void main(String[] args) 
	{
		int n1 = 13;
		int n2 = 75;
		int n3 = 9;
		int n4 = n1<n2 ? (n1<n3 ? n1 : n3) : (n2<n3 ? n2 : n3) ; 
		System.out.println("smaller no. is : " + n4);
	}
}
 