package lab8;
import java.io.*;
import java.util.Scanner;
import lab8.Mystery.*;
public class UseMystery
{
  public static void main(String[] args) throws IOException
  {
    Mystery  table;
    table = new Mystery(8,10);

    Scanner inFile = new Scanner(
      new FileReader("debug.dat"));

    table.getMystery(inFile);
    table.printMystery();
    inFile.close();
  }
}

