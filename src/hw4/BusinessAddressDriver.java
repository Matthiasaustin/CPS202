//driver to test BusinessAddress
package hw4;
import java.util.*;
import java.io.*;
import utilities.*;
public class BusinessAddressDriver {
static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
BusinessAddress address1 = new BusinessAddress("knox", "horses", "dirk heim and holt", "north ridge", "Jericho", 99999);

System.out.println(address1.toString());

BusinessAddress address2 = new BusinessAddress(in);
System.out.println(address2.toString());

}
}