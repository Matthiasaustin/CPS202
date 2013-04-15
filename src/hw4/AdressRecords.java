package hw4;
import java.io.*;
import java.util.*; 

import utilities.Address;
public class AdressRecords implements Serializable
{

	static Scanner in = new Scanner(System.in);
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		
		String street;
		String city;
		String state;
		int zip;
		ObjectOutputStream outObject = new ObjectOutputStream(new FileOutputStream("outAddresses.dat"));
		ObjectOutputStream outCount = new ObjectOutputStream(new FileOutputStream("outCount.dat"));
		String type = "z";
		BusinessAddress business;
		BusinessAddress nAddress;
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
				business.count++;
				outCount.writeInt(business.count);
				outObject.writeObject(business);
			} else {
				System.out.println("Please enter " +
						", city, state, zipcode ( followed by spaces), and street(hit enter after street is finished.");

				
				city = in.next();
				state = in.next();
				zip = in.nextInt();
				street = in.nextLine();
				nAddress = new BusinessAddress(street, city, state,zip);
				nAddress.count++;
				outCount.writeInt(nAddress.count);
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
