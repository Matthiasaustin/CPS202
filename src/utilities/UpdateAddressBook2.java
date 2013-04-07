package utilities;

//***************************************************************************
//Application UpdateAddressBook2 extends UpdateAddressBook to include a
//business entry and improve performance
//***************************************************************************
import java.io.*;

public class UpdateAddressBook2 {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException, PhoneException {
		AddressBook book = new AddressBook("addressbook.dat");
		UserInterface in = new UserInterface();
		Entry entry = in.getEntry(book); // Get the entry to change
		if (entry != null) // If it's on the file, display it
		{
			System.out.println("You selected the following entry: \n" + entry
					+ "\n");
			Field field = in.inputField(); // Ask which field to change
			switch (field) // Process request according to field type
			{
			case NAME:
				System.out.println("Name change not yet implemented.");
				break;
			case ADDRESS:
				System.out.println("Address change not yet implemented.");
				break;
			case PHONE:
				Phone phone;
				if (entry.getPhone().getClass().getSimpleName().equals("Phone"))
					phone = in.inputPhone(); // Get the phone number
				else
					phone = in.inputBusinessPhone();
				entry.setPhone(phone); // Change the entry
				book.updateEntry(entry); // Update the address book
				System.out.println("Phone number updated.");
				break;
			case NONE:
				System.out.println("No change to address book.");
				break;
			}
		} else
			// Invalid name
			System.out
					.println("Name not found in address book. No change made.");
		book.close();
	}
}
