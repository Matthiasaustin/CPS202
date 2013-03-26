package lab8;
import lab7.Date; 
public class ImportantDate
{
  Date date;
  String reason;

  /* METHODS TO BE FILLED IN: Exercise 1 */

  public ImportantDate()
  {
    reason = "None";
	  date = new Date(1,1,1);
	  
  }
  public ImportantDate(String newReason, Date newDate)
  {
	  reason = newReason;
	  date = newDate;
  }
  public String toString()
  {
	  return date + "is an important date because " + reason;
  }
  public void setDate(int day, int month, int year) 

  {
	date = new Date (day, month, year);  
  }
}

