 
 
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
int [][] baseball;					
baseball = new int [20][4];

//holds the contents of the line as read in
int [] line;
line = new int [4];

Scanner inFile = new Scanner(new FileReader("//Volumes//Storage//Code//CPS202//playdata."));

 public static void main (String [] args)
 {

while (inFile.hasNextLine())
{
//read in line from file into line array
for(int index = 0; inFile.hasNextInt(); index++)
{
	line[index] = inFile.nextInt();
}
//assign values to baseball array, summing values as values are read in 
baseball[0] = line[0];
for(int index = 1; index < line.length; index++)
{
	baseball [index]= line [index];
}
//calculate at bats
for (into index = 0; )
//calculatee batting average

//format results

//print results for all players


}
 }
}
