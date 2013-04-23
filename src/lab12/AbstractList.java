package lab12;

abstract public class AbstractList
{
	// Methods
	public abstract void store(Comparable item);
	// Pre: The list is not full
	// 		item is not in the list 
	// Post: item is in the list
	public abstract void printList();
	// Post: If the list is not empty, the elements are
	// 		 printed on the screen; otherwise "The list
	// 		 is empty" is printed on the screen
	public abstract int getLength();
	// Post: return value is the number of items in the list
	public abstract boolean isEmpty();
	// Post: returns true if list is empty; false otherwise
	public abstract boolean isFull();
	// Post: returns true if there is no more room in the
	//			 list; false otherwise
	public AbstractList() 
	{
	}
	// Constructor
	// Post: Empty list is created with maxItems cells

	// Data fields
	private  int numItems;
	private  Comparable[] values;
}

