package lab10;
     
import car.*;
// Access Date, Car, and SoldCar classes
public class Driver
{
	
	
  public static void main(String[] args)
  {
   Date date;
   Car car;
   SoldCar myCar;
   SoldCar yourCar;
    /* TO BE FILLED IN: Exercise 3 */
   //Car(double newdealerCost, int newidNumber, int day, int month, int year)
   car = new Car(19000, 12345678, 11, 12, 1992);
   //Date(int newDay, int newMonth, int newYear)
   date = new Date(11, 12, 1993);
   
  // SoldCar(double newdealerCost, int newidNumber, int aday, int amonth, 
  // int ayear,int sday, int smonth, int syear, String newcustomer, double newprice) 
   myCar = new SoldCar(19000, 23456789, 11, 12, 1991, 27, 10, 1999, "Knobby", 24000);
   yourCar = new SoldCar(19000, 23456789, 11, 12, 3000, 27, 10, 4000, "Knobby", 24000); 
   /* TO BE FILLED IN: Exercise 4 */  
   System.out.println(car.getResults());
   System.out.println(date.toString());
   System.out.println(myCar.getResults());
   System.out.println(yourCar.getResults());
   /* TO BE FILLED IN: Exercise 5 */
   System.out.println("Profit made off of yourCar is: " + yourCar.getProfit());

  }
}

