 
 
public class baseball
{

	/*
	 *Array to hold the data recieved or calculated in app
	 *
	 *col 0 holds player id
	 *col 1 holds number of hits (summed)
	 *col 2 holds number of walks summed
	 *col 3 holds number of outs summed
	 *col 4 holds number of at bats the player had
	 *col 5 holds the players batting average
	 */
	static int [][] baseball = new int [20][5];

	//holds the contents of the line as read in
	static int [] line = new int [4];

	

	public static void main (String [] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//playdata"));
		while (inFile.hasNextLine())
		{
			//read in line from file into line array
			for(int index = 0; index < 4; index++)
			{
				line[index] = inFile.nextInt();
			}
			//assign values to baseball array, summing values as values are read in 
			for(int index = 1; index <= 3; index++)
			{
				baseball [line[0]][index - 1] = baseball [line[0]][index - 1] + line [index];
			}
			//calculate at bats
			baseball [line[0]][3] = baseball [line[0]][0] + baseball [line[0]][1] + baseball [line[0]][2];
			//calculates batting average
			baseball [line[0]][4] = (baseball [line[0]][0] / (baseball [line[0]][4] + 1))-1;
			
			
			//format and print results

				for(int c = 0; c < 20; c++ )
				{
					System.out.println ( baseball[c] + " " + baseball [c][4] + " " + baseball [c][1]);	
				}
		


			}
		}
}
