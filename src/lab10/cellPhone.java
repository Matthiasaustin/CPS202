package lab10;

public class cellPhone extends Phone
{
 String maker;
 String service;
 
 public cellPhone (String servicer,String manufacterer, int Area, int number)
 {
 	num = number;
 	area = Area;
 	maker = manufacterer;
 	service = servicer;
 }
 
 public String toString ()
 {
 	return super.toString() + "\nProvider: " + service + "\nManufacturer: " + maker;
 }
}
