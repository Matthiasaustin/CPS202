package car;


import java.io.*;
public class Date implements Serializable
{
	// Data fields
	private int day;
	private int year;
	private int month;

	// Constructors
	public Date(int newDay, int newMonth, int newYear)
	{
		day = newDay;
		month = newMonth;
		year = newYear;
	}
	public Date()
	{    
		day = 1;
		month = 1;
		year = 1;
	}

	// Methods
	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{    
		return year;
	}

	public String toString()
	{
		return day + "/" + month + "/" + year;
	}

	public void setDay(int newDay)
	{
		day = newDay;
	}

	public void setMonth(int newMonth)
	{
		month = newMonth;
	}

	public void setYear(int newYear)
	{
		year = newYear;
	}

	public String CompareTo(Date Date2)
	{
		String result;

		if(day == Date2.getDay() && month == Date2.getMonth() && year == Date2.getYear())
			result = "The two dates are the same.";
		else
			result = "The two dates are different.";
		return result;
	}
}

