package lab11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import lab12.IntList;

public class IntListDriver2 
{

	static Scanner inFile;

	public static void main (String[] args) throws IOException
	{
		//15 elements in list
		IntList list1 = new IntList(15);
		//read in file
		inFile = new Scanner (new FileReader("//Volumes//Storage//Code//CPS202//src//lab11//int.dat"));
		//store file into list
		while (inFile.hasNextInt())
		{
			list1.store(inFile.nextInt());
		}
		//print list
		list1.printList();
		System.out.println("*");
		list1.writeList("list1values.dat");
		System.out.println("*");
		System.out.println(list1.contains(10));
		System.out.println("*");
		System.out.println(list1.contains(10));
		System.out.println("*");
		list1.removeItem(10);
		list1.printList();
		inFile.close();
	}
}
