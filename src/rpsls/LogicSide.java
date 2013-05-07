package rpsls;
import java.math.*;
public class LogicSide {
	static String winner = "NO WINNER";
	public static History history = new History();
	// Rock-paper-scissors-lizard-Spock 
	//import Math random

	// The key idea of this program is to equate the strings
	// "rock", "paper", "scissors", "lizard", "Spock" to numbers
	// as follows:
	//
	// 0 - rock
	// 1 - Spock
	// 2 - paper
	// 3 - lizard
	// 4 - scissors
	//
	// helper functions
	//
	//def number_to_name(number):
	protected static String numToName (int number)
	{

//	    if number == 0 :
//	        return 'rock'
	if (number == 0)
	  return "rock";

//	    else if number == 1 :
//	        return 'Spock'
	else if (number == 1)
	  return "Spock";

//	    else if number == 2 :
//	        return 'paper'
	else if (number == 2)
	  return "paper";

//	    else if number == 3 :
//	        return 'lizard'
	else if (number == 3)
	  return "lizard";

//	    else if number == 4 :
//	        return 'scissors'
	else if ( number == 4)
	  return "scissors";

//	    else :
//	        return 'Sorry, please retry'
	else 
	  return "Sorry, please try again";
	  } 
	//def name_to_number(name):
	protected static int nameToNum (String name)
	{
		int result = -999;
//	    if name == 'rock' :
//	        return 0
	if (name.equalsIgnoreCase("rock"))
	  result = 0;

//	    elif name == 'Spock' :
//	        return 1
	else if (name.equalsIgnoreCase("Spock"))
	result = 1;

//	    elif name == 'paper':
//	        return 2
	else if (name.equalsIgnoreCase("paper"))
	result = 2;

//	    elif name == 'lizard':
//	        return 3
	else if (name.equalsIgnoreCase("lizard"))
	result =  3;

//	    elif name == 'scissors' :
//	        return 4
	else if (name.equalsIgnoreCase("scissors"))
	result = 4;

//	    else :
//	        return 'Sorry, didn\'t get that, please try again'
	else 
	  System.out.println("Sorry, please try again.");
	return result;

	}

	//method rpsls(guess): 
	protected static String rpsls (String guess)
	{
	int playerNum = 0;
	int difference =  0;
	int compNum = 0;
	
//	     convert name to player_number using name_to_number
//	    player_num = name_to_number(guess)
	playerNum = nameToNum(guess);
//	     compute random guess for comp_number using random.randrange()
//	    comp_num = random.randrange(0,5)
	compNum = (int)( Math.random() * 5);

//	     compute difference of player_number and comp_number modulo five
//	    difference = (player_num - comp_num) % 5
	difference = (playerNum - compNum) % 5;
	if(difference < 0)
		difference += 5;

//	     use if/elif/else to determine winner
	    
//	    if difference  == 1 or difference == 2 :
//	        winner = 'Player'
	if (difference == 1 || difference == 2)
	  winner = "Player";
//	    if difference == 3 or difference == 4 :
//	        winner = 'Computer'
	if (difference == 3 || difference == 4)
	  winner = "Computer";
//	    if difference == 0 :
//	        winner = "No one"
	if (difference == 0)
	  winner = "No one";
//	     convert comp_number to name using number_to_name
//	    comp_guess = number_to_name(comp_num)
	String compGuess = numToName(compNum);
	History.storeScore();
//	     print results
//	    print "Player chose " + guess + "."
	return ("Player chose " + guess + "." + "\nComputer chose " + compGuess + "." + "\n" + winner + " wins!" + "\n");
//	    print "Computer chose " + comp_guess +"."
//	    print winner + " wins!"
//	    print ""    
	    }
public static void main (String [] args){
	// test the code
	System.out.println(rpsls("rock"));
	System.out.println(rpsls("Spock"));
	System.out.println(rpsls("paper"));
	System.out.println(rpsls("lizard"));
	System.out.println(rpsls("scissors"));
}
}