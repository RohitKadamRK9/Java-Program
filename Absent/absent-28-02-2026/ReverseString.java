class ReverseStirng 
{
	public static void main(String[] args) 
	{
	  String str = "hello";
	  String rev = "";
	  for (int i=0; i<str.length() ; i++ )
	  {
		  char ch = str.charAt(i);
		  rev = ch + rev ; // ch + rev is imp because it will reverse the string otherwise if (rev + ch ) string remains same 
	  }
	    System.out.println(str);
		System.out.println(rev);
	}
}
