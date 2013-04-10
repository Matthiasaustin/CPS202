package lab10;

public class cablePhone extends landPhone
{
String cableProvider;

public cablePhone()
{
	num = 0;
}
public cablePhone (String provider, int Area, int number)
{
	num = number;
	area = Area;
	cableProvider = provider;
}
public String toString ()
{
	return super.toString() + "Cable Provider: " + cableProvider;
}
}
