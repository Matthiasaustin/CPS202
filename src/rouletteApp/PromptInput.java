/* PromptInput is a class to prompt for a bet from the 
 * the user of RouletteApp, and it will then record betType and bet.
 */


package rouletteApp;
	
	

public class PromptInput {
	//variable declarations
	static betType betTypes;
	private static int bet;

	// declare enum betType
	enum betType {
		VOID, INDIVIDUAL, ROW1, ROW2, ROW3, ROW4, ROW5, ROW6, ROW7, ROW8, ROW9, ROW10, ROW11, ROW12, COL1, COL2, COL3, RED, BLACK, ODD, EVEN, FIRSTHALF, SECONDHALF
	}
// prompt user for input
	public static String introMessage() 
	{

		// explain app
		return "Roulette App is an app that lets the user, you, make bets like you were \n at a roulette table.\n" +

		// lay out bet types
		"\nThere are a number of kinds of bets your can make." +
		"\nThe different bet types are listed below, with a short explanation." +
		"\nIndividual: you can bet on an individual number." +
		"\n " +
		"\nRow: you can bet on a particular row. row1 is 1-3," +
		"\nrow2 is 4-6, row3 is 7-9, row4 is 10-12 " +
		"\nrow5 is 13-15, row6 is 16-18, row7 is 19-20, " +
		"\nrow8 is 22-24, row9 is 25-27, row10 is 28-30, " +
		"\nrow 11 is 31-33, row12 is 34-36. " +
		"\n" +
		"\nColumns: you can bet on a particular column, either col1, col2 or col3" +
		"\ncol1 includes 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34" +
		"\ncol2 includes 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35" +
		"\ncol3 includes 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36" +
		"\n" +
		"\nColor: you can bet on either red or black. Your bet type is either RED or Black" +
		"\n Red numbers include 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36" +
		"\n Black includes everything else." +
		"\n" +
		"\nEven: you can bet on all the even numbers." +
		"\n" +
		"\nOdd: you can bet on all the odd numbers." +
		"\n" +
		"\nFirstHalf: all numbers 1-18" +
		"\nor SecondHalf: all numbers 19-36" +
		"\n\nWhen ready, hit ENTER to proceed.";
	}
	//prompt for betType
	public static String promptBetType(){
		return "Please enter the type of bet you'd like to make below." +
				"\nYour options are: INDIVIDUAL, ROW1-ROW12, COL1-COL3, RED, BLACK, ODD, " +
				"\nEVEN, FIRSTHALF, or SECONDHALF" +
				"\nPlease write betType below:";
	}

	// determine if betType fits parameters

	// hold betType

	public static void holdBetType (String currentBetType)
	{
		
		betTypes = rouletteApp.PromptInput.betType.valueOf(currentBetType);
	}

	//return bet type
	public static betType getBetType ()
	{
		return betTypes; 
	}
	// prompt for bet
	public static String promptBet ()
	{
		return "So, what is your bet? If your bet type was ROW COL,RED, BLACK, ODD, EVEN, FIRSTHALF,or SECONDHALF," +
				"\njust type in the first number of your bet category. If individual number, just input the number." +
				"\nSome sample bets include bet type ROW3, the bet would be 7, for COL3, the bet is 3, for RED, bet is 1.";
	}
	// determine if bet fits parameters


	// hold bet
	public static int holdBet (int currentBet)
	{
		bet = currentBet;
		return bet;
	}

	//return bet 
	public static int getBet ()
	{
		return bet; 
	}
	// setBet method

	// determine betType

	// switch to determine correct variable type to record bet

	// record bet to correct variable type

	// getBet method

	// return bet as string or int

	//setBetType method

	// record betType

	//getBetType method
	public PromptInput() {

	}
	//return betType as string
}