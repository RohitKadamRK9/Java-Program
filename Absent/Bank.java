import java.util.Scanner;
import java.util.ArrayList ;
class Bank 
{
	static String name;
	static long contact ; 
	static int pin ; 
	static double balance ;
	static ArrayList<String> transactions = new ArrayList<String>();
	public static void main(String[] args) 
	{
		welcome :
			for( ; ; ){
		System.out.println("\n******WELC0ME******\n");
		System.out.println("     GENSHIN BANK      ");
		System.out.println("1. CREATE ACCOUNT . ");
		System.out.println("2. LOGIN  ");
		System.out.println("Enter your response : ");
		int opt = new Scanner(System.in).nextInt();
		
		switch(opt){
			case 1:{
				if(name != null){
					System.out.println("\n YOUR ACCOUNT ALREADY EXISTS \n");
					continue ;
				}
				System.out.println("\n***** ACCOUNT CREATION MODULE *****\n");
				System.out.println("NAME : ");
				name = new Scanner(System.in).nextLine();
				System.out.println("CONTACT : ");
				contact = new Scanner(System.in).nextLong();
				System.out.println("PIN : ");
				pin = new Scanner(System.in).nextInt();
				System.out.println("AMOUNT : ");
				balance = new Scanner(System.in).nextDouble();
				break;
			}
			case 2 :{
				if (name == null)
				{
					System.out.println(" CREATE AN ACCOUNT FIRST ! ");
					continue ;
				}
				System.out.println("***** LOGIN MODULE *****");
				System.out.println("CONTACT : ");
				long userContact = new Scanner(System.in).nextLong();
				System.out.println("PIN : ");
				int userPin = new Scanner(System.in).nextInt();
				if (userContact == contact && userPin == pin)
				{
					System.out.println(" LOGIN SUCCESSFUL");
					for( ; ; )
					{
					 System.out.println("\n***** FEATURES *****\n");
					 System.out.println("1.DEPOSIT .");
					 System.out.println("2.WITHDRAW");
					 System.out.println("3.CHECK BALANCE");
					 System.out.println("4.TRANSACTIONS");
					 System.out.println("5.LOGOUT ");
					 System.out.println("What you want to do ? : ");
					 int opt2 = new Scanner(System.in).nextInt();
					 switch(opt2)
						 {
							case 1:{
								System.out.println("\n***** DEPOSIT MODULE*****\n");
								System.out.println("Enter the deposit amount : ");
								double depositAmt = new Scanner(System.in).nextDouble();
								balance += depositAmt;
								transactions.add("Deposit : "+depositAmt);
								System.out.println(" AMOUNT CREDITED SUCCESSFULLY ");
								break ; 
							}
							case 2 :{
								System.out.println("\n***** WITHDRAW MODULE *****\n");
								System.out.println("Enter the amount : ");
								double withdrawAmt = new Scanner(System.in).nextDouble();
								System.out.println("Enter the pin : ");
								int userPin1 = new Scanner(System.in).nextInt();
								if(userPin1 == pin){
									if(withdrawAmt <= balance){
										balance -= withdrawAmt;
										transactions.add("Withdraw : "+withdrawAmt);
										System.out.println(" AMOUNT DEBITED SUCCESSFULLY ");
									}
									else{
										System.out.println(" INSUFFICIENT FUNDS ! ");
									}
								}
								else{
									System.out.println("\n INVALID PIN ! \n");
								}
                                break;
						    }
							case 3:{
								System.out.println("\n***** CHECK BALANCE MODULE *****\n");
								System.out.println("Enter the PIN : ");
								int userPin2 = new Scanner(System.in).nextInt();
								if(userPin2 == pin){
									System.out.println("\n Your account balance is : "+balance+" Rs. \n");
								}
								else{
									System.out.println(" INVALID PIN !");
								}
								break;
							}
							case 4:{
								System.out.println("\n***** TRANSCATION MODULE *****\n");
								for(String trans : transactions){
									System.out.println(trans);
								}
								System.out.println("\n Account Balance : "+balance+" Rs. \n");
								break;
							}
							case 5:{
								System.out.println("\n THANK YOU & VISIT AGAIN \n");
								continue welcome ;
					        }
							default :{
								System.out.println("  INVALID RESPONSE  ");
								break ; 
							}
				}
				
			}
			
		}
		else
			{
				System.out.println("\n INVALID CREDENTIALS \n");
			}
		
			
		break ;
		}
		default :{
				System.out.println("\n INVALID RESPONSE \n");
				break;
		}

	}
  }
 }
}
