package lab11;
public class IntList
{
	// Methods
	public void store(int item)
	{
		// Pre:  The list is not full 
		// Post: item is in the list
		values [numItems] = item;
		numItems++;
	}
	public void printList()

	// Post: If the list is not empty, the elements are
	//       printed on the screen; otherwise "The list
	//       is empty" is printed on the screen
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
	// Post: returns true if there is no more room in the
	//       list; false otherwise

	{
		if (numItems >= listNum)

		{
			return true;
		}
		else 
		{

		}
	}
	IntList(int maxItems)
	// Constructor
	// Post: Empty list is created with maxItems cells

	// Data fields
	private  int numItems;
	private  int[] values;
	private int listNum;
}

