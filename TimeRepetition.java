// The "TimeRepetition" class.
import java.io.*;
public class TimeRepetition
{
    public static void main (String[] args) throws IOException
    {
	long time, time2, finalTime;
	time = System.currentTimeMillis ();
	String input;
	BufferedReader in;
	System.out.println ("To quit press 'q', to run press any other key");
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();
	if (!input.equals ("q"))
	{
	    int i;
	    for (i = 0 ; i < 20 ; i++)
	    {
		System.out.println ("Hello!");
	    }
	    time2 = System.currentTimeMillis ();
	    finalTime = time2 - time;
	    System.out.println ("It took " + finalTime + " Milliseconds");
	}
    } // main method
} // TimeRepetition class
