import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for( ; ; )
		{
			System.out.print("\n******WELCOME*******\n");
			System.out.print("1.USD  ");
			System.out.print("2.EUR  ");    
			System.out.print("3.KWD  ");
			System.out.print("4.GBP  ");
			System.out.print("5.ARS  ");
			System.out.println("6.AUD  ");
			System.out.print("7.BRL  ");
			System.out.print("8.CAD  ");
			System.out.print("9.CNY  ");
			System.out.print("10.IDR  ");
			System.out.print("11.NZD  ");
			System.out.print("12.SEK  ");
			
			System.out.print("\n Enter a currency : ");
			String curr = sc.next().toUpperCase();
			
			
			System.out.print("Enter your amount (INR) : ");
			double amount = sc.nextDouble();
			
			double currConv = 0;
			if(curr.equals("USD")){
				currConv = amount/90.77 ;
			}else if(curr.equals("EUR")){
				currConv = amount/107.55 ;
			}else if(curr.equals("KWD")){
				currConv = amount/296.09 ;
			}else if(curr.equals("GBP")){
				currConv = amount/123.71 ;
			}else if(curr.equals("ARS")){
				currConv = amount/0.06 ;
			}else if(curr.equals("AUD")){
				currConv = amount/64.22 ;
			}else if(curr.equals("BRL")){
				currConv = amount/17.34 ;
			}else if(curr.equals("CAD")){
				currConv = amount/66.57 ;
			}else if(curr.equals("CNY")){
				currConv = amount/13.13 ;
			}else if(curr.equals("IDR")){
				currConv = amount/0.01 ;
			}else if(curr.equals("NZD")){
				currConv = amount/54.76 ;
			}else if(curr.equals("SEK")){
				currConv = amount/10.14 ;
			}else{
				System.out.println ("Invalid Currency");
			}
			
			System.out.printf("%n%.2f INR = %.2f %s%n", amount,currConv,curr);
		}
	}
}
