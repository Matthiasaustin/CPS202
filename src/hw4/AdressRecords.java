package hw4;
import java.io.*; 
public class AdressRecords extends Address, BusinessAddress implements Serializable
{
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		System.out.println("Please enter y if you would like to enter a Business Address,
			\nor n if you would like to enter a regular address.")
		if (in.next() == 'y')
		{
			//String newcompany, String newdepartment, String newstreet, String newcity, String newstate, int newzipcode
			System.out.println("Please enter company, department, street(please start new line here with enter key)
				, city, state, and zipcode seperated by spaces");
		} else {
			System.out.println("Please enter street(hit enter after street is finished), city, state, and zipcode followed by spaces.")
		}
	}
	
}
