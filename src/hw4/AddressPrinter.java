package hw4;

import java.io.*;

import utilities.Address;

public class AddressPrinter {
	public static void main (String [] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
 ObjectInputStream inObject;
	inObject = new ObjectInputStream(new FileInputStream("outAddresses.dat"));

	PrintWriter out;
	out = new PrintWriter(new FileWriter("outAddress.dat"));
while(inObject.hashCode())
{
	BusinessAddress outputBusiness = (BusinessAddress) inObject.readObject();
	System.out.println(outputBusiness);
	out.println(outputBusiness);
	inObject.close();
}	
}
}

