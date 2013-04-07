package utilities;

//*********************************************************************
//Class BusinessEntry implements Entry using a BusinessPhone number
//*********************************************************************
import java.io.Serializable;
import java.util.Scanner;
//import chapter8.utility.*;
public class BusinessEntry extends Entry implements Serializable
{
	Address address;
	BusinessPhone phone;
//	Default constructor
	public BusinessEntry ()
	{
		super();
		address = new Address();
		phone = new BusinessPhone();
	}
	
	public BusinessEntry(Scanner in) {
		super(in);
	}
	
//	Direct constructor
	public BusinessEntry (Name newName, Address newAddr, BusinessPhone newPhone)
	{
		super(newName);
		address = newAddr;
		phone = newPhone;
	}
//	Observers
	public Address getAddress () { return address; }
	public BusinessPhone getPhone () { return phone; }
	public String toString ()
	{
		return name + "\n" + address + "\n" + phone;
	}
//	Transformers
	public void setAddress (Address newAddress) {address = newAddress;}
	public void setPhone (Phone newPhone) 
	{
		phone = (BusinessPhone)newPhone;            // Note cast from Phone
	}
}

