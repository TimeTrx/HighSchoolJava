import java.io.*;

public class Examples
{
	public static void main(String []args) throws IOException
	{
		//create array to hold 10 ages
		int age[] = new int[10];
		//I and j are counters
		int i, j;
		//smallest is the current smallest element
		int smallest;
		//temp we use to make an element swap
		int temp;
		String line;
		//Create input variable 
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		//Loop to request 10 args to fill the array
		for(i = 0; i<=9;i++)
		{
			System.out.println("Enter an Age: ");
			line = in.readLine();
			age[i] = Integer.valueOf(line).intValue();
		}
//Selection sort!
for(i = 0; i<=9;i++)
{
	smallest = i;

for(j = i; j<=9; j++)
{
	//Compare our current smallest
	//to the current position in the array
	if(age[j] < age[smallest])
	{
		smallest = j;
	}
}
//swap smallest element with position in array
temp = age[i];
age[i] = age[smallest];
age[smallest] = temp;
}
//output
for(i = 0; i<=9;i++)
{
	System.out.println(age[i]);
	}
   }
}
