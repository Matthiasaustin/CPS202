package hw5;

import java.util.*;

public class NewArrayList extends ArrayList<Object>
{
			static int numItems;
			static Comparable [] values;
			public void add(Comparable item)
			{
				// Pre:  The list is not full 
				// Post: item is in the list
				
				values [numItems] = (String) item;
				numItems++;
			}
	public static void main (String [] args)
	{
		ArrayList[] list1 = new ArrayList [100];
		System.out.println(list1.length);
//		ArrayList [] list2;
	//	System.out.println(list2.length);
		
		
	}
}
