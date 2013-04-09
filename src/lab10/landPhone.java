package lab10;


public class landPhone extends Phone
{
String address;
String longDistance;
public landPhone (String adresses,String longD, int area, int number)
{
	num = number;
	area = this.area;
	address = adresses;
	longDistance = longD;
}

public String toString ()
{
	return super.toString() + "Address: " + address + "Long Distance: " + longDistance;
}
}
