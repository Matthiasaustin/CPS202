package lab8;
import java.io.*;
import java.util.Scanner;
public class TwoDTable
{
  public TwoDTable(int rows, int cols)
  {
    table = new int[rows][cols];
  }

  public void  getTable(Scanner inFile) 
    throws IOException
  // Reads values from inFile and stores them in the table;
  //  rowsUsed and colsUsed are the first values on the file; 
  //  values follow by row, one value per line             
  {
   rowsUsed = inFile.nextInt();
   colsUsed = inFile.nextInt();
   for (int i = 0; i < rowsUsed; i++ )
   {
    for (int j = 0; j < colsUsed; j++)
    {
      table[i][j] = inFile.nextInt();
    }
   }
  }

  public void  printTable()
  // Writes values in the table on System.out
  {
   public static PrintWriter outFile; 
   outFile = new PrintWriter(new FileWriter("//Volumes//Storage//Code//CPS202//src//lab8//tableresults.dat")); 

      for (int i = 0; i < rowsUsed; i++ )
   {
    for (int j = 0; j < colsUsed; j++)
    {
      outFile.print(table[i][j]); 
    }
    outFile.println();
   }
  }
  }

  // Data fields
  int rowsUsed;
  int colsUsed;
  int[][] table;
}

