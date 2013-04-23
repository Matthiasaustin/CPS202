package lab12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SListDriver3 
{
	static Scanner inFile;

	public static void main (String[] args) throws FileNotFoundException
	{
		//15 elements in list
		SList list1 = new SList(20);
		//read in file
		inFile = new Scanner (new FileReader("//Volumes//Storage//Code//CPS202//src//lab12//strings.dat"));
		//store file into list
		 while (inFile.hasNext())
		{
			list1.insert(inFile.next());

		}

		//print list
		list1.printList();

	}
}