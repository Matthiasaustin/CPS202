package utilities;

//************************************************************
//TestBusPhone is a driver that tests class BusinessPhone,
//a class derived from Phone
//************************************************************

public class TestBusPhone {
	public static void main(String[] args) throws Exception {
		Phone firstPhone;
		BusinessPhone secondPhone;
		System.out.println("Test results for class BusinessPhone");
		firstPhone = new Phone(523, 373, 3344);
		secondPhone = new BusinessPhone(713, 223, 3121, 1234);
		System.out.println("getArea: " + firstPhone.getArea());
		System.out.println("getExchange: " + firstPhone.getExchange());
		System.out.println("getNumber: " + firstPhone.getNumber());
		System.out.println("toString: " + firstPhone.toString());
		System.out.println("getArea business: " + secondPhone.getArea());
		System.out
				.println("getExchange business: " + secondPhone.getExchange());
		System.out.println("getNumber business: " + secondPhone.getNumber());
		System.out.println("getExtension business: "
				+ secondPhone.getExtension());
		System.out.println("toString business: " + secondPhone.toString());
	}
}
