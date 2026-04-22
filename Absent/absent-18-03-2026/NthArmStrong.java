import java.util.Scanner;
class NthArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count =0 ;
		for (int j = 1; ;j++ )
		{	
		  int ct = 0;
		
		for (int i = j; i!=0 ; i/=10)
		{
			ct++;
		}
		int sum= 0;
		for (int i = j; i!=0; i/=10)
		{
			int last = i%10;
			int pow = 1 ;
			for (int k=0; k<ct ; k++ )
			{
				pow *= last ;
			}
			sum += pow ;
		}
		if (sum == j)
		{
			count++;
			if (count == num)
			{
				System.out.println(j);
				break;
			}
			
		}
		}
	}
}
