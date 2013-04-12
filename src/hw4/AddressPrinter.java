package hw4;

import java.io.*;

import utilities.Address;

public class AddressPrinter {
	public static void main (String [] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
 ObjectInputStream inObject;
	inObject = new ObjectInputStream(new FileInputStream("outAddresses.dat"));

	PrintWriter out;
	out = new PrintWriter(new FileWriter("outAddress.dat");
	
	Address outputBusiness = (Address) inObject.readObject();
	System.out.println(outputBusiness);
	out.println(outputBusiness);
	inObject.close();
	}
}

public static String format()
{
	return 
}
