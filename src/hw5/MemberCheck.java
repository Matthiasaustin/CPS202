package hw5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
//read in a name and check it against a list of members. 
//Allow for two tries. 
//The list is in the "owners" file, with one name per line
public class MemberCheck
{
	//Variables

	static Scanner in = new Scanner(System.in);

	static int nameCount = 1;
	static int denied = 0;
	static int accepted = 0;
	static int total = 0;
	static int tries = 1;
	static int size = 0;

	static String name;
	static String again;

	static boolean pass = false; 
	static boolean more = true;
	
	static ArrayList <String> owners = new ArrayList <String> (1000);

	static boolean [] attended = new boolean [1000];


	public static void main (String [] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner (new FileReader("//Volumes//Storage//Code//CPS202//src//lab12//strings.dat"));
		//do loop
		for(int count = 0; more ; count++)
		{
			do 
			{
				//read in list
				for (int index = 0; inFile.hasNextLine(); index++)
				{
					owners.add(index,inFile.nextLine());
				}
				size = owners.size();
				//prompt user
				System.out.println("Please enter your first and last name on the line below, seperated by a space.");
				//read in name

				name = in.nextLine();
				nameCount++;
				//check against list
				pass = owners.contains(name);
				
				//pass or try against

				//if in list, move on >> accomplished in the list check step.
				//if not in list, prompt to try agains
				if(pass) 
				{
					attended[owners.indexOf(name) + 1] = true;
					break;
				}
				if(!pass && tries < 2)
				{
					attended[owners.indexOf(name)] = false;
					System.out.println("Please try again.");

				}
				//increment number of tries
				tries ++;
				System.out.println(pass);
				System.out.println();
			} while (tries <=2 && !pass);
			//repeat loop if tries is < 2 OR name in list
			

			//if name in list print success
			if(pass)
			{
				System.out.println("Thank you " + name + "\nWelcome to the event");
				accepted++;	
			}
			// if name not in list and tries used up, print rejection
			if(!pass)
			{
				System.out.println("I'm sorry " + name + "\nYou do not appear to be on the list.");
				denied++;
			}
			System.out.println("Another Name? Y or N");
			again = in.nextLine();
			if(again.equalsIgnoreCase("Y"))
			{
				more = true;
			}
			else
			{
				more = false;
			}
		}

		System.out.println("\nDenied " + getDenied() + "\nAttended " + getAccepted() + "\nTotal at Meeting " + getTotal() + "\n");
		attendanceList(); 
	}
	//record number of denies, number of accepted, and number of total that went to meeting
	public static int getDenied()
	{
		return denied;
	}

	public static int getAccepted()
	{
		return accepted;
	}

	public static int getTotal()
	{
		total = getAccepted() + getDenied ();
		return total;
	}
public static void printList()
{
	Iterator stringIterator = owners.iterator();
	while (stringIterator.hasNext())
	{
		System.out.println(stringIterator.next());
	}
}
	//print owner list with absent or present listed.
	public static void attendanceList ()
	{
		boolean match = false;
		int index = 0;
		String currentName;
		String value;
		Iterator stringIterator = owners.iterator();
		while (stringIterator.hasNext())
		{
			index++;
			
			if(attended[index])
				value = "Present";
			else
				value = "Absent";
			System.out.println(stringIterator.next() + " " + value);
		}
	}
}































