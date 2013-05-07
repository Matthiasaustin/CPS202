package rpsls;
/********************************************************************************
* Writer: Aaron Lee
* Date: 4/30/2013
* Class: CPS 202
* Application: List class that keeps and handles cumulative records of
* the RPSLS game. Stores records as integers in a file. 
*******************************************************************************/

import java.io.*;
import java.util.*;
public class History{

//data members
static int index = 0;
static int[] records;
static int numValues;
static int maxValues;
static String player = "Player";
static String computer = "Computer";

//constructor
History(int length)
{
records = new int[length];
numValues = 0;
maxValues = length;
for(int i = 0; i < records.length; i++)
{ 
	records [i] = 200;
}
}
//default constructor
History()
{
records = new int[100];
numValues = 0;
maxValues = 10;
for(int i = 0; i < records.length; i++)
{ 
	records [i] = 200;
}
}

//stores the win/loss/draw in the next consecutive space
public static void storeScore()
{
//for wins
if (LogicSide.winner.equalsIgnoreCase("Player"))
{
records[index] = 1;
index++;
numValues++;
}
//for losses
else if (LogicSide.winner.equalsIgnoreCase("Computer"))
{
records[index] = 0;
index++;
numValues++;
}
//for draws
else
{
records[index] = -1;
index++;
numValues++;
}
}

//returns total number of games ever played
public static int totalGames()
{
return numValues;
}

//returns total number of wins
public static int totalWins()
{
int wins = 0;
int i;
for (i = 0; i < records.length; i++)
{
if (records[i] == 1)
wins++;
}
return wins;
}

//returns total number of losses
public static int totalLosses()
{
int losses = 0;
for (int i = 0; i < records.length; i++)
{
if (records[i] == 0)
losses++;
}
return losses;
}

//returns total number of draws
public static int totalDraws()
{
int draws = 0;
for (int i = 0; i < records.length; i++)
{
if (records[i] == -1)
draws++;
}
return draws;
}

public static String results()
{
	return "Wins: "+ totalWins() +"\nLosses: " + totalLosses() + "\nTotal Draws: " + totalDraws() + "\nTotal Games: " + totalGames(); 
}

//initializing a list upon start of new session
public void readResults() throws FileNotFoundException, IOException
{
Scanner inFile = new Scanner(new FileReader("GameRecords.dat"));
int placeHolder;
int newLength = 0;
int i = 0;
while (inFile.hasNextLine())
{
placeHolder = inFile.nextInt();
newLength++;
}

History newList = new History(newLength);
inFile.reset();

while (inFile.hasNextLine())
{
records[i] = inFile.nextInt();
i++;
}

inFile.close();
}

//for when the round of games is over
public void writeResults() throws IOException, FileNotFoundException
{	
PrintWriter outFile = new PrintWriter(new FileWriter("GameRecords.dat"));

if (numValues > 0) 
{
for (int i = 0; index < numValues; i++)
outFile.println(records[i]);
}
else 
{
System.out.println("The List is Empty");
}
outFile.close();
}

public static void printList()
{
int i = 0;
while (i < records.length)
{
if (records[i] == 0)
System.out.println("Computer won");
if (records[i] == 1)
System.out.println("Player won");
else
System.out.println("Round draw");
i++;
}
}

} //class end
