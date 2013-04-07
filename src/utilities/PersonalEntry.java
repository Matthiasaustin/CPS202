package utilities;

//*********************************************************************
//Class PersonalEntry implements Entry using a standard Phone number
//*********************************************************************
import java.io.Serializable;
import java.util.Scanner;

public class PersonalEntry extends Entry implements Serializable {
	Address address;

	Phone phone;

	// Default constructor
	public PersonalEntry() {
		super();
		address = new Address();
		phone = new Phone();
	}

	public PersonalEntry(Scanner in) {
		super(in);
	}

	// Direct constructor
	public PersonalEntry(Name newName, Address newAddr, Phone newPhone) {
		super(newName);
		address = newAddr;
		phone = newPhone;
	}

	// Observers
	public Address getAddress() {
		return address;
	}

	public Phone getPhone() {
		return phone;
	}

	public String toString() {
		return name + "\n" + address + "\n" + phone;
	}

	// Transformers
	public void setAddress(Address newAddress) {
		address = newAddress;
	}

	public void setPhone(Phone newPhone) {
		phone = newPhone;
	}
}
