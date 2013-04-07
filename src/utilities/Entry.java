package utilities;

//*********************************************************************
//Abstract class Entry is the base class for various types of address
//book entry classes. Only the Name operations are implemented here
//*********************************************************************
import java.io.Serializable;
import java.util.Scanner;

abstract public class Entry implements Serializable, Comparable
{
	Name name;
//	Default constructor
	public Entry () { name = new Name(); }
//	Direct constructor
	public Entry (Name newName) { name = newName; }
	
	  // Scanner-based constructor
	  public Entry (Scanner in)
	  {
	    String first = in.next();
	    String last = in.next();
	    String middle = in.next();
	    String separator = in.nextLine();
	    name = new Name(first, last, middle);
	    this.setAddress(new Address(in));
	    int area = in.nextInt();
	    int exch = in.nextInt();
	    int numb = in.nextInt();
	    try { setPhone(new BusinessPhone(area, exch, numb, 101)); }
	    catch (Exception ex) { setPhone(new Phone()); }
	  }
	  

//	Observers
	public Name getName () { return name; }
	abstract public Address getAddress();
	abstract public Phone getPhone();
	abstract public String toString ();
	final public int compareTo(Object obj)
	{
		return name.compareTo((Name) obj);
	}
//	Transformers
	public void setName (Name newName) {name = newName;}
	abstract public void setAddress(Address newAddress);
	abstract public void setPhone(Phone newPhone);
}

