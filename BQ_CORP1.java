import java.io.*;
import java.util.*;
public class BQ_CORP1
{
    static int t = 0; //remember mike to declare these as class variables
    static String input;
    static int d;
    static String name[] = new String [200]; //This is a variable, it is used to hold the employee's name
    static int started[] = new int [200]; //These are the variables, this one is used for the year that the employee started at the company
    static BufferedReader in; //These stay 'static'
    public static void main (String[] args) throws IOException
    {
	do
	{



	    {

		System.out.println ("Welcome to the BQ Virtual Employee Information System"); //Displays the menu title
		System.out.println ("Please Enter a Selection \n(A) Show Information\n(B) Enter/Add Information\n(C) Modify Information\n(D) Delete Information\n(Q) Quit");  // Required to: Enter Information, Add Information, Display Information, Delete Information, and Modify Information
		in = new BufferedReader (new InputStreamReader (System.in)); //allows a choice to be entered
		input = in.readLine (); //read the choice

		if (input.equalsIgnoreCase ("b"))
		    //if 'b' is inputted
		    {
			addInfo ();

		    }
		if (input.equalsIgnoreCase ("a"))
		    //if 'a' is inputted
		    {
			showInfo ();

		    }
		if (input.equalsIgnoreCase ("c")) //if 'c' is inputted
		{
		    String moc;
		    //flag to hold position in array
		    int flag = 0;

		    int I;
		    boolean found = false;
		    //ask for input
		    System.out.println ("What is the Employee's name you wish to modify? ");
		    moc = in.readLine ();
		    for (I = 0 ; I <= (t - 1) ; I++)
		    {
			//If we find it, mark the spot!
			if (moc.compareTo (name [I]) == 0)
			{
			    flag = I;
			    found = true;
			}
		    }
		    if (found == false)
		    {
			System.out.println ("Employee not found");
		    }
		    else
		    {
			//enter modified information
			System.out.print ("Enter new Name: ");
			name [flag] = in.readLine ();
			System.out.print ("Enter new Year: ");
			started [flag] = Integer.valueOf (in.readLine ()).intValue ();
		    }
		}


		if (input.equalsIgnoreCase ("d")) //if 'd' is inputted
		{
		    //String to hold user input
		    String capcom;
		    //flag to hold position in array
		    int flag = 0;
		    //counter
		    int I;
		    int x;
		    boolean found = false;
		    //ask for input
		    System.out.print ("What is the Employee's name you wish to delete?");
		    capcom = in.readLine ();
		    for (I = 0 ; I <= (I - 1) ; I++)
		    {
			//if we find it, mark the spot!
			if (capcom.compareTo (name [I]) == 0)
			    ;
			{
			    flag = I;
			    found = true;
			}
		    }
		    if (found == false)
		    {
			System.out.println ("Item not found");
		    }
		    else
		    {

			for (I = flag ; I <= (I - 2) ; I++)
			{
			    //shift the array
			    name [I] = name [I + 1];
			    started [I] = started [I + 1];
			}
			//Now we have 1 less criminal, so
			//Don't forget we have to update our total
			//Criminal variable "x"
			x = I - 1;

		    }
		}



	    }
	}
	while (!input.equalsIgnoreCase ("q"))
	    ;
    }


    public static void showInfo ()
    {
	for (d = 0 ; d < t ; d++)
	{
	System.out.println ("Name: " + name [d]); //outputs name
	System.out.println ("Started On: " + started [d]); //outputs year
    }

}
    public static void addInfo () throws IOException
    {
	//enters the employees name
	System.out.print ("Enter the Employee's Name: ");
	name [t] = in.readLine (); //reads the name
	System.out.print ("Enter the Year Employee Started: "); //signals user to enter the year the employee started
	started [t] = Integer.valueOf (in.readLine ()).intValue ();
	//reads the year inputted
	t++; //acts as the counter
    }
}



