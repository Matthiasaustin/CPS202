package lab8;
import java.util.Scanner;
import java.io.*;

import lab7.Date;
public class ImDateDriver
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		ImportantDate[] myDates;
		myDates = new ImportantDate[20];
		Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab7//date1"));
		Date aDate;
		ImportantDate myDate;
		while (inFile.hasNextLine())
		{
			int index = 0;
			
			int day;
			int month;
			int year;
			String reason;
			
			day = inFile.nextInt();
			month = inFile.nextInt();
			year = inFile.nextInt();
			reason = inFile.next();

			aDate = new Date(day, month, year);
			myDate = new ImportantDate(reason, aDate);

			myDates [index] = myDate; 
			index++;
		}
	}
}


