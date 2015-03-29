// The "TimeRepetition" class.
import java.io.*;

public class TimeRecursion
{
    static String input;
    public static void main (String[] args) throws IOException
    {

	long time;
	time = System.currentTimeMillis ();
	BufferedReader in;
	String j = "Hi";
	System.out.print ("To quit press 'q', to run enter 'Hello'");
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();
	option (input);
	long time2, finalTime;
	time2 = System.currentTimeMillis ();
	finalTime = time2 - time;
	System.out.println ("It took " + finalTime + " Milliseconds");
    }


    public static String option (String input)
    {
	if (!input.equals ("q"))
	{
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	    System.out.println (input);
	}
	return input;
    }
} // main methods
