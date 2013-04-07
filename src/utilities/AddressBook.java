package utilities;

import java.io.*;
import java.util.Scanner;

public class AddressBook
{
	String inName;
	Entry[] book = new Entry[100];
	int numEntries = 0;
	int place = -1;
//	Default Constructor
	public AddressBook() throws IOException, ClassNotFoundException
	{
		this("addressbook.dat");  // Call parameterized constructor for default file
	}
	
	public AddressBook(int i) {
		
	}
	
//	Parameterized Constructor
	public AddressBook(String inFileName) throws IOException, ClassNotFoundException
	{
		inName = inFileName;      // Save input file name
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(inName));
		int index = 0;
		try
		{                         // Copy file into array until array is full
			for (index = 0; index < book.length; index++)  {
				book[index] = (Entry)in.readObject();
			}
			numEntries = book.length;
		}
		catch (EOFException ex)   // If EOF encountered before array filled
		{
			numEntries = index;     // Record actual number of entries
		}
		in.close();
	}
//	Search address book for entry with matching name
	public Entry getEntryByName(Name name)
	{
		for (int index = 0; index < numEntries; index++)  {     // Search array for match
			if (book[index].getName().compareTo(name) == 0)
			{
				place = index;                                    //   Save entry index
				return book[place];                               //   Return matching entry 
			}
		}
		// If not found
		place = -1;                                           //   Set place to invalid
		return null;                                          //   Return null entry
	}
//	Change current entry
	public void updateEntry(Entry entry)
	{
		if (place >= 0)                                     // If current is valid
			book[place] = entry;                              //   Replace entry
	}
//	Write book to file
	public void close() throws IOException
	{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(inName));
		for (int index = 0; index < numEntries; index ++)
			out.writeObject(book[index]);
		out.close();
	}
	
	public void convertToObjectAddressBook() throws IOException {
		BusinessEntry entry;
		File f = new File("addressbook.dat");
		f.createNewFile();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		Scanner in = new Scanner(new FileReader("addressbook.txt"));
		if (in.hasNextLine())
			in.nextLine();
		else
			System.out.println("File is empty.");
		while (in.hasNext()) {
			entry = new BusinessEntry(in);
			System.out.println("Writing entry " + entry);
			out.writeObject(entry);
		}
		out.close();
		in.close();
	}
	
	public static void main(String[] args) throws Exception {
		AddressBook ab = new AddressBook(4);
		ab.convertToObjectAddressBook();
	}
}

