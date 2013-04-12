package car;
import java.util.*;
import java.io.*;

public class Car{

	//create a car with categories dealer, cost, id number and date arrived
	//variables
	double dealerCost;
	int idNumber;
	Date arrived;


	public Car(){
		idNumber = 999999999;
		arrived = new Date();
		dealerCost = 9999999999.99;
	}

	public Car(double newdealerCost, int newidNumber, int day, int month, int year) {
		dealerCost = newdealerCost;
		idNumber = newidNumber;
		arrived = new Date (day, month, year);
	}
	//get dealer cost, a float

	protected double getDealerCost()
	{
		return dealerCost;
	}

	//get id number, return int


	protected int getIdNumber()
	{
		return idNumber;
	}

	//get date arrived, return date

	protected Date getArrived ()
	{
		return arrived;
	}
	//format results for printing, return string

	public String getResults()
	{
		return "The dealer cost is: $" + getDealerCost() + "\nThe cars ID number is: " +
				"" + getIdNumber() + "\nThe date the car arrived is " + arrived.toString();
	}

	public double getPrice() {
		
		return dealerCost;
	}


}
