package hw4;

import java.io.*;

import utilities.Address;

public class AddressPrinter {
	public static void main (String [] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{

		int check = 0;
		
		ObjectInputStream inObject;
	inObject = new ObjectInputStream(new FileInputStream("outAddresses.dat"));

	ObjectInputStream inCount;
	inCount = new ObjectInputStream(new FileInputStream("outCount.dat"));
	int count = (int) inCount.read();

	PrintWriter out;
	out = new PrintWriter(new FileWriter("outAddress.dat"));
do
{
	BusinessAddress outputBusiness = (BusinessAddress) inObject.readObject();
	System.out.println(outputBusiness);
	out.println(outputBusiness);
	check++;
} while(check <= count);
inObject.close();
}
}

