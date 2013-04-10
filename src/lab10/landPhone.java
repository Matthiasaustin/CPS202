package lab10;


public class landPhone extends Phone
{
String address;
String longDistance;
landPhone() 
{
	
}
public landPhone (String adresses,String longD, int Area, int number)
{
	num = number;
	area = Area;
	address = adresses;
	longDistance = longD;
}



public String toString ()
{
	return super.toString() + "Address: " + address + "Long Distance: " + longDistance;
}
}
