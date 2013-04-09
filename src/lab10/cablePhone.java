package lab10;

public class cablePhone extends Phone
{
String cableProvider;

public cablePhone (String provider, int area, int number)
{
	num = number;
	area = this.area;
	cableProvider = provider;
}
public String toString ()
{
	return super.toString() + "Cable Provider: " + cableProvider;
}
}
