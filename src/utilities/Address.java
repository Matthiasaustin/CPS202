package utilities;
//*********************************************************************
// This class represents an address
//*********************************************************************
import java.util.Scanner;
import java.io.*;
public class Address implements Serializable
{
  protected String street;        // Street address
  protected String city;          // City part of the address
  protected String state;         // The state (two-letter abbreviation)
  protected int zipCode;

  public Address()      // Default constructor
  {
    street = "";
    city = "";
    state = "";
    zipCode = 0;
  }

  public Address(Scanner in)           // Scanner constructor
  {
    String space = in.next();
	street = in.nextLine();
    city = in.next();
    state = in.next();
    zipCode = in.nextInt();
    String separator = in.nextLine();  // Read past end-of-line mark
  }
  
  // Field get methods
  public String getStreet() {return street;}
  public String getCity() {return city;}
  public String getState() {return state;}
  public int getZipCode() {return zipCode;}

  public String toString() 
  {
    return street + '\n' + city + ", " + state + "  " + zipCode;
  }
}