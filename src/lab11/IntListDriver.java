package lab11;
import java.io.*;
import java.util.*;

import lab12.IntList;

public class IntListDriver 
{
	static Scanner inFile;

	public static void main (String[] args) throws FileNotFoundException
	{
		//15 elements in list
		IntList list1 = new IntList(15);
		//read in file
		inFile = new Scanner (new FileReader("//Volumes//Storage//Code//CPS202//src//lab11//int.dat"));
		//store file into list
		while (inFile.hasNextInt())
		{
			list1.store(inFile.nextInt());
			list1.printList();
			System.out.println("*");
		}
		//print list
		list1.printList();

	}
}
