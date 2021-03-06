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
int count = 0;
public BusinessAddress()
{
	compName = "";
	dpt = "";
	street = "";
	state = "";
	zipCode = 0;
	count = 0;
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
    count = 0;
  }

public BusinessAddress(String nstreet, String ncity, String nstate, int nzip)
{
	street = nstreet;
	city = ncity;
	state = nstate;
	zipCode = nzip;
	count = 0;
}
public BusinessAddress (String newcompany, String newdepartment, String newstreet, String newcity, String newstate, int newzipcode)
{
      compName = newcompany;
    dpt = newdepartment;
    street = newstreet;
    city = newcity;
    state = newstate;
    zipCode = newzipcode;
    count = 0;
}

public String getCompName () {return compName;}
public String getDept () { return dpt;}

public String toString() 
  {
    return compName + ", " + dpt + '\n' + street + '\n' + city + ", " + state + "  " + zipCode;
  }












}