// RouletteApp is to place a bet based on user input and to determine whether 
// a bet is won or lost based on the rolled number and will repeat until 
// the user decides to end.
package rouletteApp;

import java.util.*;



public class RouletteApp {

	// Declare variables for RouletteApp
	static Boolean newWager = true;
	static Scanner in = new Scanner(System.in);
	static private String again;
	static private String betType;
	static private int roll;
	static private double random;
	static private int bet;
	static PromptInput.betType currentBetType;
	
	
	// Declare Main method
	public static void main(String [] args){
		
		// intro app and explain what bets will look like
		System.out.println(PromptInput.introMessage());

		//Begin Do-Loop
		while (newWager == true) {
			betType = in.nextLine();
			// generate random number, the roll
			RandomNumber ();
			//prompt for bet type
			System.out.println(PromptInput.promptBetType());
			// record input
			
			betType = in.nextLine();
			System.out.println("void1");
			System.out.println();
			System.out.println("void2");
			betType = betType.toUpperCase();
			System.out.println(currentBetType);
			System.out.println("void3");
			PromptInput.holdBetType(betType);
			System.out.println("void4");
			System.out.println("Your bet type was: " + PromptInput.getBetType ());
			System.out.println("void5");
			System.out.println();
			System.out.println("void6");
			System.out.println(PromptInput.promptBet());		//prompt bet
			bet = in.nextInt();
			PromptInput.holdBet(bet);							//return bet type to PromptInput
	
			System.out.println();
			
			//print roll			
			System.out.println("The roll was: " + getRoll());

			// sort the bet



			// sort the roll



			// compare the bet to the roll

			
					
					
			// output results

			System.out.println(Sort.compareTo(getRoll(), PromptInput.getBet(), PromptInput.getBetType()));

			// ask user if they would like to continue
			System.out.println("Wanna get out of here? If so, type 'yes' below");
			again = in.next();
			if (again.equalsIgnoreCase("yes"))
			{
				newWager = false;
			} else {
				newWager = true;
			}
			//continue loop until user tells otherwise


		}
	}
	// enables access to betType by other classes
	public static String getBetType(){
		return betType;
	}
	// generate and return random number
	private static void RandomNumber () {
		while( roll == 0)
		{
		random = 1.0;  // the container for the random number prior to being refined for roll
		roll = 0;
		random = (Math.random() * 36);
		roll = (int) random;
		}
	}

	public static int getRoll () 
	{
		return roll;
	}
}//end of class

