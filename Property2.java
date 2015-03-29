import java.io.*;
public class Property2
{
    static BufferedReader in;
    static BufferedReader wide;
    static BufferedReader longe;
    static double storey;
    static double width;
    static double length;
    static double price;//All the variables
    static String input;
    static String s;
    static String d;
    static String e;
    static double area;
    public Property () throws IOException//This 
    {
	System.out.println ("Please enter a width");
	wide = new BufferedReader (new InputStreamReader (System.in));
	d = wide.readLine ();
	width = Double.valueOf (d).doubleValue ();
	System.out.println ("Please enter a length");
	longe = new BufferedReader (new InputStreamReader (System.in));
	e = longe.readLine ();
	length = Double.valueOf (e).doubleValue ();
	System.out.println ("Would you like to calculate area? Or price?");
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();
	if (input.equals ("area"))
	{
	    calculateArea ();
	}
	if (input.equals ("price"))
	{
	    calculatePrice ();
	}
    }


    public Property (double storey) throws IOException
    {
	System.out.println ("Please enter a width");
	wide = new BufferedReader (new InputStreamReader (System.in));
	d = wide.readLine ();
	width = Double.valueOf (d).doubleValue ();
	System.out.println ("Please enter a length");
	longe = new BufferedReader (new InputStreamReader (System.in));
	e = longe.readLine ();
	length = Double.valueOf (e).doubleValue ();
	System.out.println ("Would you like to calculate area? Or price?");
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();
	if (input.equals ("area"))
	{
	    calculateArea ();
	}
	if (input.equals ("price"))
	{
	    calculatePrice ();
	}
    }


    public static void calculateArea ()
    {
	area = (length * width) * storey;
	System.out.println ("The total area: " + area + " Meters");
    }


    public static void calculatePrice ()
    {
	area = (length * width) * storey;
	price =(area*2.24)*1.15;
	System.out.println("The price for a house with these dimensions is: $"+price);
    }


    public static void main (String[] args) throws IOException
    {
	System.out.println ("Welcome to Property PDA");
	System.out.println ("Please enter how many floors");
	in = new BufferedReader (new InputStreamReader (System.in));
	s = in.readLine ();
	storey = Double.valueOf (s).doubleValue ();
	if (storey == 1)
	{
	    new Property ();
	}


	else
	{
	    new Property (storey);
	}
    }
}
