import java.util.Scanner;
class PalindromeStringTwoPointer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		String str = sc.nextLine();
		boolean assump = true;
		
		for (int i = 0, j=str.length()-1; i<str.length()/2 ; i++, j-- )
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			
			if (ch1 != ch2)
			{
				assump = false ;
				break ;
			}
		}
		if (assump)
		{
			System.out.println(str+" is palindrome .");
		}else{
			System.out.println(str+" is not palindrome .");
		}
		
	}
}
