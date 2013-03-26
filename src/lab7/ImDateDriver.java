package lab7;
import java.util.Scanner;
import java.io.*;

import lab7.Date;
import lab8.ImportantDate;
public class ImDateDriver
{
  @SuppressWarnings("null")
public static void main(String[] args) throws FileNotFoundException
  {
    ImportantDate[] myDates;
    myDates = new ImportantDate[20];
    Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab7//date1"));
    Date aDate;
    ImportantDate myDate;
    for(int index = 0; inFile.hasNextLine(); index++)
    {
    ImportantDate tempDate = null;
    
    
    tempDate.setDate(inFile.nextInt(), inFile.nextInt(), inFile.nextInt());
    tempDate.reason = inFile.next();
    tempDate = new ImportantDate(tempDate.reason, tempDate.date);
     myDates[index]= tempDate;
    }
  }
}

