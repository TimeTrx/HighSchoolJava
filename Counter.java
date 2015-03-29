
	// The "Counter" class.
	import java.io.*;
	public class Counter
	{
	    //DECLARE CLASS VARIABLES
	    //*************************
	    static String name[] = new String [3];
	    static String crime[] = new String [3];
	    static int year[] = new int [3];
	    public static void main (String[] args) throws IOException
	    {
		//Counter
		int i;
		int x;
		//Create Fileinput
		BufferedReader input;
		input = new BufferedReader (new FileReader ("C:\\Users\\Mike\\Documents\\criminal.txt"));
		//x is the total number of criminals
		//We read the header of the file to figure
		x = Integer.valueOf (input.readLine ()).intValue (); //YOU READ THE NUMBER OF RECORDS
		System.out.println ("Loading " + x + " Criminals"); //FROM THE CRIMINALS.TXT FILE
		//Loop through all the criminals in the file
		//why do we loop till I<=(x-1)??
		//Because Arrays start at 0 right!
		//And so an array of ten criminals would
		//End in position 9: (x-1)!!!
		for (i = 0 ; i <= (x - 1) ; i++)
		{
		    //Read in the data
		    name [i] = input.readLine ();
		    crime [i] = input.readLine ();
		    //We put the read line right into the
		    //integer conversion.
		    year [i] = Integer.valueOf (input.readLine ()).intValue ();
		}
		input.close (); //DON'T FORGET TO CLOSE THE FILE
		//LET'S SEE WHAT WE READ IN THE ABOVE FILE
		//*****************************************
		System.out.println (); //PRINT A BLANK LINE
		for (i = 0 ; i < x ; i++)
		{
		    System.out.println (name [i] + ", " + crime [i] + ", " + year [i]);
		}
	    }
	
    } // main method

