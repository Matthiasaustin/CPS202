package utilities;

//***************************************************************************
//Class UserInterface provides operations to interact via System.in.
//Note: initially implements changing only the Phone field
//***************************************************************************
import java.util.*;
import java.io.*;

public class UserInterface {
	Scanner in;

	//	Default Constructor
	public UserInterface() {
		in = new Scanner(System.in);
	}

	//	Get name from user and return matching entry from address book
	public Entry getEntry(AddressBook addressBook) throws IOException,
			ClassNotFoundException {
		System.out.println("Enter the name you wish to search for.");
		System.out.print("(Format: first middle last):");
		String first = in.next();
		String middle = in.next();
		String last = in.next();
		String eol = in.nextLine(); // Discard rest of line
		Name name = new Name(first, last, middle);
		return addressBook.getEntryByName(name);
	}

	//	Get field name from user and return matching enum
	public Field inputField() {
		boolean invalidField;
		Field inField = Field.NONE;
		do {
			System.out
					.println("Enter the field you wish to change from the following:");
			for (Field type : Field.values())
				System.out.println(type);
			try // Read string and convert to enum
			{
				inField = Field.valueOf(in.nextLine().toUpperCase());
				invalidField = false;
			} catch (IllegalArgumentException ex) // User entered invalid field
			{
				invalidField = true;
				System.out.println("Invalid field name entered.");
			}
		} while (invalidField); // Try again until field is valid
		return inField;
	}

	// Get business phone number from user and return BusinessPhone object
	public BusinessPhone inputBusinessPhone() throws PhoneException {
		System.out
				.println("Enter the phone number and extension. Example: 800 555 1212 0100");
		int area = in.nextInt();
		int exch = in.nextInt();
		int numb = in.nextInt();
		int extn = in.nextInt();
		String eol = in.nextLine(); // Discard rest of line
		return new BusinessPhone(area, exch, numb, extn);
	}

	//	Get phone number from user and return Phone object
	public Phone inputPhone() throws PhoneException {
		System.out.println("Enter the phone number. Example: 800 555 1212");
		int area = in.nextInt();
		int exch = in.nextInt();
		int numb = in.nextInt();
		String eol = in.nextLine(); // Discard rest of line
		return new Phone(area, exch, numb);
	}
}
