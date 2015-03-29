import java.io.*;
import java.util.*;

public class SortingAssignment //Revision 15
{

    static String names[] = new String [45]; //all the class variables
    static int phone[] = new int [45];
    public static void main (String[] args) throws IOException
    {
	//Trying this counter
	int i;
	String sptemp;
	int notemps;
	String inputs;
	int smallest;
	int j;


	BufferedReader input;
	BufferedReader in; //Creating 2 Buffered readers for input
	in = new BufferedReader (new FileReader ("C:\\Users\\Mike\\Documents\\phoneData.txt")); //must be opened on my computer at this file position
	String line = in.readLine ();

	j = 0;
	while (line != null)
	{
	    names [j] = line;
	    line = in.readLine ();  //inputting the two types
	    phone [j] = Integer.valueOf (line).intValue ();
	    line = in.readLine ();
	    j++;
	}




	//Here we output our Menu
	System.out.println ("Name (a) or Number (b) ");

	//Here we get user input
	input = new BufferedReader (new InputStreamReader (System.in));
	inputs = input.readLine ();

	if (inputs.equalsIgnoreCase ("a")) //If a then it will be a name
	{

	    System.out.print ("Selection(a) or Bubble Sort(b)");
	    input = new BufferedReader (new InputStreamReader (System.in));
	    inputs = input.readLine ();
	    if (inputs.equalsIgnoreCase ("a")) //if a is entered then selction sort is selected
	    {
		for (i = 0 ; i < names.length ; i++)

		    {
			smallest = i;
			for (j = i ; j < names.length ; j++)

			    {
				if (names [j].compareTo (names [smallest]) < 0)
				{
				    smallest = j;

				}
				//swap element with position in array
				sptemp = names [i];
				names [i] = names [smallest];
				names [smallest] = sptemp;

			    }
		    }
		for (int c = 0 ; c < names.length ; c++)
		{
		    System.out.println (names [c]);

		}
	    }
	    if (inputs.equalsIgnoreCase ("b"))
	    {
		{ //if b selection is inputted

		    for (i = 0 ; i < names.length ; i++) //fixed this, turned j++ into i++ :)

			{
			    for (j = 0 ; j < names.length - 1 ; j++)
				if (names [j + 1].compareTo (names [j]) < 0)
				{
				    sptemp = names [j];
				    names [j] = names [j + 1];
				    names [j + 1] = sptemp;
				}
			}
		}
	    }
	    for (int c = 0 ; c < names.length ; c++)
	    {
		System.out.println (names [c]);
	    }
	}
	if (inputs.equalsIgnoreCase ("b")) //fixed the bracket arrangement to get the program to work correctly
	{
	    {
		{
		    {
			System.out.print ("Selection(a) or Bubble Sort(b)");
			input = new BufferedReader (new InputStreamReader (System.in));
			inputs = input.readLine ();
			if (inputs.equalsIgnoreCase ("a"))
			{

			    for (i = 0 ; i < phone.length ; i++) // no input bad mike!

				{
				    smallest = i;
				    for (j = i ; j < phone.length - 1 ; j++)

					{
					    if (phone [j] < phone [smallest])
					    {
						smallest = j;
					    }
					}
				    //swap element with position in array
				    notemps = phone [j];
				    phone [j] = phone [smallest];
				    phone [smallest] = notemps;//switched j + 1 with smallest

				}
			    for (int c = 0 ; c < phone.length ; c++)
			    {
				System.out.println (phone [c]);
			    }
			}

			if (inputs.equalsIgnoreCase ("b"))



			    for (i = 0 ; i < phone.length ; i++)
			    {
				for (j = 0 ; j < phone.length - 1 ; j++)
				{
				    if (phone [j + 1] < phone [j])
				    {
					notemps = phone [j];
					phone [j] = phone [j + 1];
					phone [j + 1] = notemps;

					//Here we call the method to add the record
				    }
				}
			    }
			for (int c = 0 ; c < phone.length ; c++)
			{
			    System.out.println (phone [c]);//fixed the almost endless loop
			}

		    }

		}

	    }
	}
    }
}


