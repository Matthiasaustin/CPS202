package lab10;

public class PhoneDriver 
{
static Phone phone;
static cablePhone cable;
static landPhone land;
static cellPhone cell;
public static void main (String [] args)
{
System.out.println();
phone.setArea(425);
phone.setNum(5126639);
cell= new cellPhone("Something", "Other", 625,5555);
land= new landPhone("Something", "Other", 225,5555);
cable = new cablePhone("Something", 425,5565);

System.out.println(phone.toString());
System.out.println(cell.toString());
System.out.println(land.toString());
System.out.println(cable.toString());
}
}
