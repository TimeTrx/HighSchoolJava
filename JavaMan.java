// The "JavaMan" class.
import java.io.*;

public class JavaMan
{
    public static void main (String[] args) throws IOException
    {
	//Sorter Variable
	String x[] = new String [200];
	String inside;
	//Input the file below
	BufferedReader in;
	BufferedReader input;
	in = new BufferedReader (new FileReader ("C:\\Users\\Mike\\Documents\\nameList.txt"));
	//Read in the data

	System.out.println ("What name would you like to search for? ");
	input = new BufferedReader (new InputStreamReader (System.in)); //enter the name to search for here
	inside = input.readLine ();
	int i = 0;
	x [i] = in.readLine ();
	//search for name in array
	while (x [i] != null)
	{
	    
	    if (inside.compareToIgnoreCase (x [i]) == 0) //compares the input and the list
	    {
		System.out.println ("This name can be found at line: " + i);

	    }
	    i = i + 1;
	    x[i] =in.readLine();
	    
	}
	
	x [i] = in.readLine ();
	//search for name in array
	while (x [i] != null)
	{
	    
	    if (inside.compareToIgnoreCase (x [i]) == 0) //compares the input and the list
	    {
		System.out.println ("This name can be found at line: " + i);

	    }
	    i = i + 1;
	    x[i] =in.readLine();
	input.close ();
    }
    }
}

