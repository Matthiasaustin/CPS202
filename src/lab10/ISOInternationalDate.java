package lab10;

import java.text.NumberFormat;

public class ISOInternationalDate extends AbDate
{

	
	ISOInternationalDate(int nday, int nmonth, int nyear)
	{
		

		day = nday;
		month = nmonth;
		year = nyear;
	}
	
	public String toString()
	{
		NumberFormat fyear = NumberFormat.getInstance();
		
		fyear.setMaximumIntegerDigits(4);

		NumberFormat fdm = NumberFormat.getInstance();
		
		fdm.setMaximumIntegerDigits(2);
	return fdm.format(year) + "/" + fdm.format(month) + "/" + fyear.format(day);	
	
	}
}
