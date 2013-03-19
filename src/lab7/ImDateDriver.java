package lab7;
import java.util.Scanner;
import java.io.*;
public class ImDateDriver
{
  public static void main(String[] args)
  {
    ImportantDate[] myDates;
    myDates = new ImportantDate[20];
    Scanner inFile = new Scanner(new FileReader("myDates"));
    Date aDate;
    
    
    ImportantDate myDate;
    while (inFile.hasNextLine())
    {
    aDate = new Date(inFile.nextInt(),inFile.nextInt(),inFile.nextInt());
    
      aDate = new ImportantDate();
      myDates[1]=aDate;
    }
  }
}

