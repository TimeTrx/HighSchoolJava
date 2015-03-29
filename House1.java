// The "House" class.
import java.io.*;
public class House1
{
    static double length;
    static double width;
    static double storey;


    public static void main (String[] args) throws IOException
    {
	//Declare your variables here:
	//*****************************

	Property newproperty; // = new Property(length, width);
	//Property newprop = new Property(storey, length, width);
	System.out.println ("Welcome to Property PDA");
	System.out.println ("Please enter how many floors");
	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	String s = in.readLine ();
	storey = Double.valueOf (s).doubleValue ();
	System.out.println ("Please enter a width");
	String d = in.readLine ();
	width = Double.valueOf (d).doubleValue ();
	System.out.println ("Please enter a length");
	String e = in.readLine ();
	length = Double.valueOf (e).doubleValue ();
	if (storey > 1)
	{
	    newproperty = new Property (storey, length, width);
	}
	else
	{
	    newproperty = new Property (length, width);
	}

	double area = newproperty.calculateArea ();
	double price = newproperty.calculatePrice (area);
	System.out.println ("Area of house is: " + area+ " Units");
	System.out.println ("Price of house is: $" + price);
    }
}

