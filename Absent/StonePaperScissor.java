import java.util.Scanner;
class StonePaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int userCount = 0 ;
		int botCount = 0  ;
		//label for continue statement
		gamingloop:
		for( ; ; ){//infinte loop .
		System.out.println("\n**********WELCOME**********\n");
		System.out.println("      STONE.PAPER.SCISSOR     \n");
		System.out.println("1.STONE \n2.PAPER \n3.SCISSOR \n");
		System.out.print("Enter your reponse : ");
		int userResponse = sc.nextInt();
		
		if(userResponse<1 || userResponse>3 ){
			System.out.println("\n   INVALID INPUT   \n");
			continue gamingloop ;
		}
		
		String user = "";
		if(userResponse == 1) user = "STONE";
		else if(userResponse == 2) user = "PAPER";
		else user = "SCISSOR";
		
		// bot implementaion
		int botResponse = 0 ;
		for(int i =1; i<=100; i++){
			botResponse = (int)(Math.random()*10);// Math.random() gives output in 0.somthing so we *10 .
			if(botResponse>=1 && botResponse <= 3) break ;
		}
		
		String bot = "";
		if(botResponse == 1) bot = "STONE";
		else if (botResponse == 2) bot = "PAPER";
		else bot = "SCISSOR";

		System.out.println();
		System.out.println("    BOT       USER");
		System.out.println("    "+bot+"   "+user);
		
		//Declration of Winner
		
		
		if(bot.equals("STONE") && user.equals("PAPER") ||
		   bot.equals("PAPER") && user.equals("SCISSOR") ||
		   bot.equals("SCISSOR") && user.equals("STONE"))
			{
				System.out.println("\n   ***** USER WON *****   \n");
				userCount++;
			}
			else if (bot.equals("STONE") && user.equals("SCISSOR") ||
				     bot.equals("PAPER") && user.equals("STONE") ||
				     bot.equals("SCISSOR") && user.equals("PAPER"))
			{
				System.out.println("\n   ***** BOT WON *****   \n");
				botCount++;
			}
			else{
				System.out.println("\n   ***** ITS A DRAW *****   \n");
			}
			System.out.println("\n RESULT ");
			System.out.println("\n USER : "+userCount);
			System.out.println("\n BOT : "+botCount);
			
		}
		
	}
}
