// sort class sorts bet, betType, and roll into comparable values

package rouletteApp;

import rouletteApp.*;

@SuppressWarnings("unused")
public class Sort {

	enum betType1 {
		INDIVIDUAL, ROW1, ROW2, ROW3, ROW4, ROW5, ROW6, ROW7, ROW8, ROW9, ROW10, ROW11, ROW12, COL1, COL2, COL3, RED, BLACK, ODD, EVEN, FIRSTHALF, SECONDHALF
	}



	//declare variables

	//bool variables

	public static Boolean individual, row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, col1, col2, col3, red, black, odd, even, firsthalf, secondhalf;
	//roll
	static int roll = RouletteApp.getRoll();
	//bet
	static int bet = PromptInput.getBet();
	//betType
	rouletteApp.PromptInput.betType betType = PromptInput.getBetType();
	//bool win = false
	static boolean win = false;


	//method checks if a number, either bet or roll, would fulfill a wager's requirement
	/**		public static void checkNumber (int number) {
		//check if color type
			//red or black
			if (number ==  1)
			{
				red = true;
				black = false;
			} else {
				black = true;
				red = false;
			}
		//check if odd or even
			if (number == 1)
			{
				odd = true;
				even = false;
			} else {
				even = true;
				odd = false;
			}

		//check if roll is first or second half of table
			if (number == 1)
			{
				firsthalf = true;
				secondhalf = false;
			} else {
				secondhalf = true;
				firsthalf = false;
			}
		//check if row
			//row if
			if (number == 1) {row1 = true;}
			else if (number == 4) {row2 = true;}
			else if (number == 7) {row3 = true;}
			else if (number == 10) {row4 = true;}
			else if (number == 13) {row5 = true;}
			else if (number == 16) {row6 = true;}
			else if (number == 19) {row7 = true;}
			else if (number == 22) {row8 = true;}
			else if (number == 25) {row9 = true;}
			else if (number == 28) {row10 = true;}
			else if (number == 31) {row11= true;}
			else if (number == 34) {row12 = true;}
			else { row1 = false; row2 = false; row3= false; row4 = false; row5 = false; 
				row6 = false; row7= false; row8= false; row9= false; row10= false; row11= false; row12= false;}
		//check if column
			//column switch
			if (number == 1) {col1 = true;}
			else if (number == 2) {col2 = true;}
			else if (number == 3) {col3 = true;}
			else { col1 = false; col2 = false; col3 = false;}
		//else is where individual #s end up

			} 
	 * @return */
	// compare to method
	//compare the values
	public static String compareTo (int roll, int bet, rouletteApp.PromptInput.betType betType)
	{
		int currentBet = bet;
		int currentRoll = roll;

		//check if color type
		//red or black
		/**			switch (currentRoll )			//wasn't working correctly, so I decided to simplify
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 9:
				case 12:
				case 14:
				case 16:
				case 18:
				case 19:
				case 21:
				case 23:
				case 25:
				case 27:
				case 30:
				case 32:
				case 34:
				case 36: red = true;
				default: black = true;
				} */
		if (currentRoll ==  1 || currentRoll == 3 || currentRoll == 5 || currentRoll == 7 || currentRoll == 9 || currentRoll == 12 || currentRoll == 14 || currentRoll == 16 
				|| currentRoll == 18 || currentRoll == 19 || currentRoll == 21
				|| currentRoll == 23 || currentRoll == 25 || currentRoll == 27 || currentRoll == 30 || currentRoll == 32 || currentRoll == 34 || currentRoll == 36)
		{
			red = true;
			black = false;
		} else {
			black = true;
			red = false;
		} 

		//check if odd or even
		if (currentRoll == 1)
		{
			odd = true;
			even = false;
		} else {
			even = true;
			odd = false;
		}

		//check if roll is first or second half of table
		if (currentRoll == 1)
		{
			firsthalf = true;
			secondhalf = false;
		} else {
			secondhalf = true;
			firsthalf = false;
		}
		//check if row
		//row if
		if (currentRoll == 1) {row1 = true;}
		else if (currentRoll == 4) {row2 = true;}
		else if (currentRoll == 7) {row3 = true;}
		else if (currentRoll == 10) {row4 = true;}
		else if (currentRoll == 13) {row5 = true;}
		else if (currentRoll == 16) {row6 = true;}
		else if (currentRoll == 19) {row7 = true;}
		else if (currentRoll == 22) {row8 = true;}
		else if (currentRoll == 25) {row9 = true;}
		else if (currentRoll == 28) {row10 = true;}
		else if (currentRoll == 31) {row11= true;}
		else if (currentRoll == 34) {row12 = true;}
		else { row1 = false; row2 = false; row3= false; row4 = false; row5 = false; 
		row6 = false; row7= false; row8= false; row9= false; row10= false; row11= false; row12= false;}
		//check if column
		//column switch
		if (currentRoll == 1) {col1 = true;}
		else if (currentRoll == 2) {col2 = true;}
		else if (currentRoll == 3) {col3 = true;}
		else { col1 = false; col2 = false; col3 = false;}
		//else is where individual #s end up

		switch (betType) 
		{
		case INDIVIDUAL : 
			if(bet == currentRoll) { win = true;} 
			else {win = false;} 
			break;
		case ROW1 : 
			if (bet == 1 && row1) 
			{
				win = true;
			} else {win = false;} 
			break;
		case ROW2 :
			if (bet == 4 && row2) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW3 :
			if (bet == 7 && row3) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW4 :
			if (bet == 10 && row4) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW5 :
			if (bet == 13 && row5) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW6 :
			if (bet == 16 && row6) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW7 :
			if (bet == 19 && row7) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW8 :
			if (bet == 22 && row8) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW9 :
			if (bet == 25 && row9) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW10 :
			if (bet == 28 && row10) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW11 :
			if (bet == 31 && row11) 
			{
				win = true;
			}else {win = false;} 
			break;
		case ROW12 :
			if (bet == 34 && row12) 
			{
				win = true;
			}else {win = false;} 
			break;
		case COL1 :	if (bet == 1 && col1) {win = true;} else {win = false;} break;
		case COL2 : if (bet == 2 && col2) {win = true;} else {win = false;} break;
		case COL3 : if (bet == 3 && col3) {win = true;} else {win = false;} break;
		case RED :	if (bet == 1 && red) {win = true;} else {win = false;} break;
		case BLACK : if (bet == 2 && black) {win = true;} else {win = false;} break;
		case ODD : if ((bet % 2  == 0) && (currentBet % 2 == 0))  {win = false;} else {win = true;} break;
		case EVEN : if ((bet % 2  == 0) && (currentBet % 2 == 0))  {win = true;} else {win = false;} break;
		case FIRSTHALF : if (bet <=18 && firsthalf)  {win = true;} else {win = false;} break;
		case SECONDHALF : if (bet >=19 && secondhalf)  {win = true;} else {win = false;} break;
		default : win = false; break;




		}
		return OutputWin.wagerOutput(win);
	}
}
