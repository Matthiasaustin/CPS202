// Application Text counts the occurrence of all characters 
// in a text file
package lab7;
import java.util.Scanner;
import java.io.*;
public class Text
{
  public static void main(String[] args) throws IOException
  {
    int[] charCount;    
    charCount = new int[256];  // Contains character counts
    char[] lineArray;
    
    int index;
    String line;
    Scanner inFile;
    inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab7//Text.dat"));

    while (inFile.hasNextLine())
    {
      line = inFile.nextLine();
      for(index = 0; index < line.length(); index++)
      {
    	  lineArray = new char[line.length() + 1];
    	  lineArray[index] = line.charAt(index);
    	  charCount[(int)lineArray[index]] = charCount[(int)lineArray[index]] + 1;
      }
    }
    for (index = 0; index < charCount.length; index++)
    {
     char character;
     int count;
     character = (char) index;
     count = charCount[index];
     System.out.println("The character " + character +" occurs " + count + " times.");
    }
    inFile.close();
  }
}

