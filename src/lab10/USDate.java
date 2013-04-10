package lab10;

import java.text.*;
import java.text.NumberFormat;
public class USDate extends AbDate
{

public String toString()
{
	NumberFormat fyear = NumberFormat.getInstance();
	
	fyear.setMaximumIntegerDigits(4);

	NumberFormat fdm = NumberFormat.getInstance();
	
	fdm.setMaximumIntegerDigits(2);
	return fdm.format(month) + "/" + fdm.format(day) + "/" + fyear.format(year);	
}

USDate(int nday, int nmonth, int nyear)
{
	day = nday;
	month = nmonth;
	year = nyear;
}
}
