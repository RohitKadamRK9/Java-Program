class RecArmStrong
{
	public static void main(String []args)
	{
		System.out.println(isArmStrong(153));
	}
	
	public static boolean isArmStrong(int num)
	{
		return sumOfDigit(num,num,0) == num;
	}
	
	public static int sumOfDigit(int num,int temp,int sum)
	{
		return num==0 ? sum :sumOfDigit(num/10,temp,sum+(power(num%10,count(temp,0))));
	}
	
	public static int power(int base,int raise)
	{
		return raise==0 ? 1 : base*power(base,raise-1);
	}
	
	public static int count(int num,int ct)
	{
		return num==0 ? ct : count(num/10, ct+1);
	}
	
	public static int rotate(int num)
	{
		return num%10*power(10,count(num/10,0))+num/10;
	}
}