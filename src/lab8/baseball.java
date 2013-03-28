package lab8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

 
 
public class baseball
{

	/*
	 *Array to hold the data recieved or calculated in app
	 *
	 *col 0 holds player id
	 *col 1 holds number of hits (summed)
	 *col 2 holds number of walks summed
	 *col 3 holds number of outs summed
	 *col 4 holds number of at bats the player had
	 *col 5 holds the players batting average
	 */
	static int [][] baseball = new int [20][5];

	//holds the contents of the line as read in
	static int [] line = new int [4];


	

	public static void main (String [] args) throws FileNotFoundException
	{
		
		for(int index = 0; index < 20; index++)
		{
			for (int i = 0; i < 5; i++)
			{
				baseball[index][i] = 0;
			}
		}
		
		Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//playdata"));
		while (inFile.hasNextLine())
		{

				for(int index = 0; index < 20; index++)
	{
		for (int i = 0; i < 5; i++)
		{
			baseball[index][i] = 0;
		}
	}
			//read in line from file into line array
			for(int index = 0; index < 4; index++)
			{
				line[index] = inFile.nextInt();
			}
			//assign values to baseball array, summing values as values are read in 
			for(int index = 1, i = 0; index <= 3; index++, i++)
			{
				baseball [line[0]][i] = (baseball [line[0]][i]) + (line [index]);

			}
			//calculate at bats
			baseball [line[0]][3] = baseball [line[0]][0] + baseball [line[0]][1] + baseball [line[0]][2];
			//calculates batting average
			baseball [line[0]][4] = (baseball [line[0]][0] / (baseball [line[0]][4] + 1))-1;
			
			
			//format and print results
			for(int i=0; i<20; i++)
				   System.out.println( baseball[i] + " " + baseball [i][4] + " " + baseball [i][1] );

		


			}
		}
}
