package lab12;

import java.awt.*;

public class SList extends AbstractList {

	// Methods
	public void insert(String item)
	// Pre:	The list is not full 
	//			item is not in the list
	// Post: item is in the list; the items are in sorted order
	{
		
		//if list is not full
		if(!isFull())
		{
			int index = numItems - 1;
			//while place not found AND more places to look
			while (index > 0 &&(item.compareTo(values[index]) < 0))
			{
				//if item < current item in list decrement current position, and shift number up one position
				if ((item.compareTo(values[index]) < 0))
				{
					values[index + 1] = values[index];
					index--;
				}
				//else, place found
				
			}
			//Add item, increment current position
			values [index + 1] = item;
			numItems++;

		}
	}

	public void printList()
	// Post:	If the list is not empty, the elements are
	//				printed on the screen; otherwise "The list
	//				is empty" is printed on the screen
	{
		if(numItems > 0)
		{
			for (int index = 0; index < numItems; index++)
				System.out.println(values[index]);
		}
		else
		{
			System.out.println("The List is Empty");
		}
	}
	public int getLength()
	// Post: return value is the number of items in the list
	{
		return numItems;
	}
	public boolean isEmpty()
	// Post: returns true if list is empty; false otherwise
	{
		if (numItems < 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	// Post:	returns true if there is no more room in the
	//				list; false otherwise
	{
		if (numItems >= values.length)

		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	SList(int maxItems)
	// Constructor
	// Post: Empty list is created with maxItems cells
	{
		values = new String[maxItems];
		currentItem = 0;
		numItems = 0;
	}

	public boolean contains(String item)
	// returns true if its parameter is in the list and false otherwise
	{
		int first;
		int last;
		boolean found;
		first = 0;
		last = numItems - 1;
		found = false;
		while (!found && last - first != 0)
	
		{
			int middle;
			middle = (first + last) / 2;
			if (item.equalsIgnoreCase(values[middle]))
			{
				found = true;
			}
			else if ((item.compareTo(values[middle]) < 0))
			{
				last = middle - 1;
			}
			else
			{
				first = middle + 1;
			}
		}
		return found;
	}
	
	
	public void resetList()
	// Set numItems & currentItem to 0
	{
		numItems = 0;
		currentItem = 0;
	}
	public String next()
	// Returns the item at values[currentItem]
	// Increments currentItem
	{
		String next = values[currentItem];
		currentItem++;
		return next + "" ;
	
	}
	
	public boolean hasNext()
	// Returns true if currentItem is not equal to numItems
	{
	if (currentItem < numItems)
		return true;
	else
		return false;
	}
	
	public void store(Comparable item)
	{
		// Pre:  The list is not full 
		// Post: item is in the list
		values [numItems] = (String) item;
		numItems++;
	}
	
	// Data  fields
	private  int numItems;
	private  String[] values;
	private int currentItem;



		


		
		
	}



