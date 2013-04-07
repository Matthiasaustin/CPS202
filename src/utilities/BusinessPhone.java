package utilities;

//******************************************************************
//Class BusinesssPhone extends class Phone and adds an extension
//******************************************************************
public class BusinessPhone extends Phone
{
	private int extension;             // This is the new field

	public BusinessPhone()
	{
		super();                         // Superclass constructor sets inherited fields
		extension = 9999;                // Here we just set the new field
	}
	public BusinessPhone(int area, int exch, int number, int exten) throws PhoneException
	{
		super(area, exch, number);       // Superclass constructor sets inherited fields
		extension = exten;               // Here we just set the new field
	}
	//	Observer method to return the new field
	public int getExtension() { return extension; }
	//	New toString method that overrides superclass toString
	public String toString()
	{
		String str = super.toString();   // Superclass toString does the hard work
		return (str + "x" + extension);  // Then we append the new field
	}
}
