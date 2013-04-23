package lab12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class SListDriver 
	{
		static Scanner inFile;

		public static void main (String[] args) throws FileNotFoundException
		{
			//15 elements in list
			SList list1 = new SList(20);
			//read in file
			inFile = new Scanner (new FileReader("//Volumes//Storage//Code//CPS202//src//lab11//int.dat"));
			//store file into list
			 while (inFile.hasNextInt())
				{
					list1.insert(inFile.nextInt());
				}
			list1.insert(11);
			//print list
			list1.printList();

		}
	}

