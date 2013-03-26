package lab8;
import java.util.Scanner;
import lab8.TwoDTable;
import java.io.*;
public class UseTable
{
  public static void main(String[] args) throws IOException
  {
    TwoDTable  table;
    table = new TwoDTable(10, 8);

    Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab8//twod.dat"));

    table.getTable(inFile);
    table.rowSum();
    table.colSum();
    table.printTable();
    inFile.close();
  }
}


