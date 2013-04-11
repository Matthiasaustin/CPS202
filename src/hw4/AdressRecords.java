package hw4;
import java.io.*;
import java.util.*; 

import utilities.Address;
public class AdressRecords extends Address implements Serializable
{

	static Scanner in = new Scanner(System.in);
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		ObjectOutputStream outObject = new ObjectOutputStream(new FileOutputStream("outAddresses.dat"));
		String type = "z";
		BusinessAddress business;
		Address nAddress;
		boolean iterate = true;
		String again;
		while ( iterate == true)
		{	
			System.out.println("Please enter y if you would like to enter a Business Address," +
					"\nor n if you would like to enter a regular address.");
			type = in.next();
					if (type.equalsIgnoreCase("y"))
			{
				//String newcompany, String newdepartment, String newstreet, String newcity, String newstate, int newzipcode
				System.out.println("Please enter company, department, street(please start new line here with enter key)" +
						", city, state, and zipcode seperated by spaces");
				business = new BusinessAddress(in);
				outObject.writeObject(business);
			} else {
				System.out.println("Please enter street(hit enter after street is finished)" +
						", city, state, and zipcode followed by spaces.");
				nAddress = new Address(in);
				outObject.writeObject(nAddress);
			}
			System.out.println("Thank you. If you would like to record another address, type y.");
			again = in.next();

			if(again.equalsIgnoreCase("y")) { iterate = true; }
			else { iterate = false; }
		}
		outObject.close();
	}
	
}
