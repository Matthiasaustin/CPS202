package lab9;
import java.util.*;

import car.Car;
public class carDriver {
	
public static void main (String [] args){
	Car cars = new Car(14000.00, 1245632, 11, 10, 2001);

	System.out.println(cars.getResults());
}
}
