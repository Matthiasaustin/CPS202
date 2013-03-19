package lab7;

import java.io.Serializable;

public class Date	implements Serializable 
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
     return "The date is: " + month + "." + day + "." + year;
  }
 public void compareTo(Date date2) //can use any value to compare except for toString
  {
	  if (day == date2.day && month == date2.month && year == date2.year)
		  System.out.println("The dates are the same.");
	  else
		  System.out.println("The dates are different.");
  } 
}

