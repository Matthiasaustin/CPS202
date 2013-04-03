package lab9;

public class SoldCar extends Car
{
	//profit gained
	double profit;
	//instance of car
	Car currentCar;
	//price
	double price;
	//customer
	String customer;
	//date sold
	Date sold;
	//constructor
	SoldCar(){
			idNumber = 999999999;
			arrived = new Date();
			dealerCost = 9999999999.99;
			sold = new Date();
			customer = "none";
			price = 9999999999999.99;	
	}
	
	SoldCar(double newdealerCost, int newidNumber, int aday, int amonth, 
			int ayear,int sday, int smonth, int syear, String newcustomer, double newprice) {
		currentCar = new Car(newdealerCost,newidNumber, aday, amonth, ayear);
		sold = new Date(sday,smonth,syear);
		customer = newcustomer;
		price = newprice;	
}
	// get price, float
	protected double getPrice()
	{
	return price;
	}
	// get customer, string
	protected String getCustomer()
	{
	return customer;
	}
	// get date sold, date
	protected Date getSold()
	{
	return sold;
	}
	//calculate profit, float
	protected double getProfit()
	{
		profit = getPrice() - currentCar.getDealerCost();
		return profit;
	}
	//format output, string
	protected String getResults()
	{
		return "The dealer cost is: $" + getDealerCost() + "\nThe cars ID number is: " +
				"" + getIdNumber() + "\nThe date the car arrived is " + arrived.toString() +
				"\nThe customer is: " + getCustomer() + "\nThe date the car was sold is: " + sold.toString()
				+ "\nThe price of the car sold is: " + getPrice() + "\nThe profit made on the car is: " + getProfit()
				;
	}
}
