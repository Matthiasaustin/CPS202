// Application Reverse reads numbers into an array 
// and prints them out in reverse order.   

package lab7;
import java.util.Scanner;
import java.io.*;
public class Reverse
{ 
	public static void main(String[] args) throws IOException
	{
		final int MAX = 10;
		Scanner inFile = 
				new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//src//lab7//Reverse.dat"));
		int[]  numbers;
		numbers = new int[MAX];

	//	int  value;
		int  index;
		for (index = 0; index < numbers.length; index++)
		{
		
			numbers[index] = inFile.nextInt();
		}

		for (index = MAX - 1; index >= 0; index--)
		{
			System.out.println(numbers[index]);
		}
		int sum = 0;
		
		for (index = 0; index < MAX; index++)
		{
			sum = sum + numbers[index];
		
		}System.out.println(sum);
		inFile.close();
	}
}

