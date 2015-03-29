// The "Seek" class.
import java.io.*;
public class Seek
{

    public static void seek () throws IOException
    {

	String name[] = new String [30];
	String student[] = new String [30];
	for (int i = 0 ; i < 4 ; i++)
	{
	    RandomAcccessFile schoolFile = new RandomAccessFile ("school.jsd", "r");
	    student [i] = new StudentRecord (schoolFile);
	}
	name [3] = student.getName ();
	System.out.println ("Name 3: " + name [3]);
    }


    //Display Method
    public static void main (String[] args) throws IOException
    {

	{



	    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	    RandomAccessFile schoolFile = new RandomAccessFile ("raf.jsd", "rw");
	    for (int i = 0 ; i < 4 ; i++)
	    {
		byte[] name = new byte [30];
		System.out.println ("Enter name: ");
		name [i] = in.readLine ();
		StudentRecord student = new StudentRecord (name [i]);
		student.write (schoolFile);
	    }
	    seek ();
	}

    } // main method
} // Seek class


