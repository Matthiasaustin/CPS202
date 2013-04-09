package lab10;

public class Phone {
	// areacode
	protected int area = 0;
	//number
	protected int num = 0;

	//getArea
	public int getArea()
	{
		return area;
	}
	//getNumber
	public int getNum()
	{
		return num;
	}
	//setArea
	public void setArea(int areaCode)
	{
		area = areaCode;
	}
	//setNumber
	public void setNum(int number)
	{
		num = number;
	}
	//toString
	public String toString()
	{
		return "(" + area + ")-" + num;
	}
}
