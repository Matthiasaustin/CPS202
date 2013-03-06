
// outputWin is a class to format and print the results of the RouletteApp

package rouletteApp;

import java.util.Scanner;



public class OutputWin {
	Scanner in = new Scanner(System.in);


	// print bet type
	static public String wagerOutput (boolean win) {
		boolean winner = win;
		return "Your bet type was: " + RouletteApp.getBetType() +

				// print the bet
				"\nYour bet was: " + PromptInput.getBet() +

				/**	// print the roll
			"\nThe roll was: " + RouletteApp.getRoll() +
				 */
				//print win or loss
				"\nThat means you" + winLoss (winner);

	}

	// if-else statement to determine printed message.
	private static String winLoss(boolean winner) {
		if(winner)
			return " won!";
		else
			return " lost. Better luck next time.";
	}
}
