//extend the address class from utiility wit ha BusinessAddress class that 
//adds a compay name attribute and a department attribute.
//like existing address class, new class will be immutable 
//and merely provide constructors, observers for its attributes and toString().
package hw4;
import utilities.*;
import java.io.*;
import java.util.*;
public class BusinessAddress extends Address implements Serializable
{
	
String compName;
String dpt;

public BusinessAddress()
{
	compName = "";
	dpt = "";
	street = "";
	state = "";
	zipCode = 0;
}

public BusinessAddress(Scanner in)
 {
   	compName = in.next();
   	dpt = in.next();
    street = in.nextLine();
    city = in.next();
    state = in.next();
    zipCode = in.nextInt();
    String separator = in.nextLine();  // Read past end-of-line mark
  }

public String getCompName () {return compName;}
public String getDept () { return dpt;}

public String toString() 
  {
    return compName + ", " + dept + '\n' + street + '\n' + city + ", " + state + "  " + zipCode;
  }












}