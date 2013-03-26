package lab8;
import java.util.*;
import java.io.*;

import lab7.Date;
public class ImDateDriver
{
	
	public static void main(String[] args) throws FileNotFoundException, InputMismatchException
	{
		ImportantDate[] myDates;
		myDates = new ImportantDate[20];
		Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab7//date1"));
		Date aDate;
		ImportantDate myDate;
		
		for (int index= 0; inFile.hasNextLine(); index++)
		{

			
			int day;
			int month;
			int year;
			String reason;
			
			day = inFile.nextInt();
			month = inFile.nextInt();
			year = inFile.nextInt();
			reason = inFile.nextLine();

			aDate = new Date(day, month, year);
			myDate = new ImportantDate(reason, aDate);

			myDates [index] = myDate; 
			System.out.println(index);
		}
		for (int i = 0; i < myDates.length; i++)
		{
			System.out.println(myDates[i].toString());
			System.out.println();
		}
	}
}


