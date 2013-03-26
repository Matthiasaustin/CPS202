package lab8;
import java.io.*;
import java.util.Scanner;
public class TwoDTable
{
	// Data fields
	static int rowsUsed;
	static int colsUsed;
	static int[][] table;
	static int [] rowSum = new int[rowsUsed];
	static int [] colSum = new int[colsUsed];
	public TwoDTable(int rows, int cols)
	{
		table = new int[rows][cols];
	}

	static public void  getTable(Scanner inFile) 
			throws IOException
			// Reads values from inFile and stores them in the table;
			//  rowsUsed and colsUsed are the first values on the file; 
			//  values follow by row, one value per line             
			{
		colsUsed = inFile.nextInt();
		rowsUsed = inFile.nextInt();
		for (int i = 0; i < colsUsed; i++ )
		{
			for (int j = 0; j < rowsUsed; j++)
			{
				table[j][i] = inFile.nextInt();
			}
		}
			}

	public void  printTable() throws IOException
	// Writes values in the table on System.out
	{
		PrintWriter outFile; 
		outFile = new PrintWriter (new FileWriter("//Volumes//Storage//Code//CPS202//src//lab8//tableresults.dat")); 

		for (int i = 0; i < colsUsed; i++ )
		{
			for (int j = 0; j < rowsUsed; j++)
			{
				outFile.print(table[j][i]); 
			}
			outFile.println();
		}
		outFile.println("the largest value in the file is " + largest());
		outFile.println("the smallest value in the file is " + min());
		for (int index = 0, count = 1; index < rowsUsed; index++, count++)
		{
		outFile.println("The sum for row" + (count) + " is " + rowSum[index] );
		}
		
		for (int index = 0, count = 1; index < colsUsed; index++, count++)
		{
		outFile.println("The sum for column" + (count) + " is " + colSum[index] );
		}
		
		outFile.close();
	}
	static public int largest ()
	// finds largest value in table
	{
		int max = 0;
				for (int i = 0; i < rowsUsed; i++ )
		{
			for (int j = 0; j < colsUsed; j++)
			{
				if (table[i][j] > max)
				max = table[i][j];
			}
		}
		return max;
	}

	static public void rowSum ()
	//sums each row
	{
	
	
		for (int r = 0; r < rowsUsed ; r++)
		{
			rowSum[r] = 0;
		for (int n = 0; n < colsUsed ; n++)
		{
			{ rowSum[r] = rowSum[r] + table[r][n]; }

		}
		}
	
	}

	
	static public void colSum ()
	{
		
		
		for (int c = 0; c < colsUsed ; c++)
		{
		for (int r = 0; r < colsUsed ; r++)
		{
		{ colSum[c] = colSum[c] + table[r][c]; }
		}
		}
	}

	static public int min ()
	// finds largest value in table
	{
		int min = 0;
				for (int i = 0; i < rowsUsed; i++ )
		{
			for (int j = 0; j < colsUsed; j++)
			{
				if (table[i][j] < min)
				min = table[i][j];
			}
		}
		return min;
	}

}




