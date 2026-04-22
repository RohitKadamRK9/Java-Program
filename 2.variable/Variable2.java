class Variable2 
{
	public static void main(String[] args) 
	{
		//same local variable in different block
		{
			int age = 12;
			
			System.out.println(age);
		}
		{
			char age = 'a';
			
			System.out.println(age);
		}
	}
}
