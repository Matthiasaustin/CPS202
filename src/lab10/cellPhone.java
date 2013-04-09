package lab10;

public class cellPhone extends Phone
{
 String maker;
 String service;
 
 public cellPhone (String servicer,String manufacterer, int area, int number)
 {
 	num = number;
 	area = this.area;
 	maker = manufacterer;
 	service = servicer;
 }
 
 public String toString ()
 {
 	return super.toString() + "\nProvider: " + service + "\nManufacturer: " + maker;
 }
}
