package hw5;

import java.util.*;

public class NewArrayList extends ArrayList<Object>
{
		
	public static void main (String [] args)
	{
		ArrayList <int> list1 = new ArrayList <int> (100);
		System.out.println(list1.length);
		ArrayList<int> list2 = new ArrayList<int>();
		System.out.println(list2.length);
		list1.add(7);
		Iterator listIterator = list1.iterator();
		while (listIterator.hasNext())
		{
			System.out.println(list1.next());
		}
		ArrayList <String> stringList = new ArrayList <String>(20)
		Iterator stringIterator = stringList.iterator();
		while (stringIterator.hasNext())
		{
			System.out.println(stringList.next());
		}
	}
}
