package hw5;

import java.util.*;

import lab12.SList;

public class NewArrayList extends ArrayList<Object>
{
		
	public static void main (String [] args)
	{
		ArrayList <String> list1 = new ArrayList <String> (100);
		System.out.println(list1.size());
		ArrayList <SList> list2 = new ArrayList <SList>();
		System.out.println(list2.size());
		list1.add("None");
		System.out.println(list1.indexOf("None"));
		System.out.println(list1.size());
		Iterator listIterator = list1.iterator();
		while (listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		ArrayList <String> stringList = new ArrayList <String>(20);
		Iterator stringIterator = stringList.iterator();
		while (stringIterator.hasNext())
		{
			System.out.println(stringIterator.next());
		}
	}
}
