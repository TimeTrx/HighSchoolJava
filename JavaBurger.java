// The "JavaBurger" class.
import java.io.*;
import java.util.*;
public class JavaBurger
{
    public static void main (String[] args) throws IOException
    {

	String input; //variables declared
	double cost; //cost has to be a double
	cost = 0;
	String post; //Final payment
	double finals; //Final total

	//Output the menu
	System.out.println ("Mr. Java's Burger Joint's Menu");
	System.out.println ();
	System.out.println ("A. JavaBurger $2.50");
	System.out.println ("B. Double JavaBurger $3.75");
	System.out.println ("C. Super Java Burger $4.75");
	System.out.println ("D. Small Fry $1.50");
	System.out.println ("E. Medium Fry $2.50");
	System.out.println ("F. Large Fry $3.00");
	System.out.println ("G. Small Drink $1.50");
	System.out.println ("H. Medium Drink $2.50");
	System.out.println ("I. Large Drink $3.00");
	System.out.println ("J. Cupcake $5.00");
	System.out.println ("Q. Exit");

	//Ask for choice
	System.out.println ();
	do
	{
	    { //get input
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("What is your Choice? ");
		input = in.readLine ();
	    }
	    if (input.equalsIgnoreCase ("a"))
	    {
		System.out.println ("JavaBurger $2.50 added");
		cost = cost + 2.50;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("b"))
	    {
		System.out.println ("Double JavaBurger $3.75 added"); //These are the prices and output the names
		//these are the price counters
		cost = cost + 3.75;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("c"))
	    {
		System.out.println ("Super JavaBurger $4.75 added");
		cost = cost + 4.75;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("d"))
	    {
		System.out.println ("Small Fry $1.50 added");
		cost = cost + 1.50;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("e"))
	    {
		System.out.println ("Medium Fry $2.50 added");
		cost = cost + 2.50;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("f"))
	    {
		System.out.println ("Large Fry $3.00 added");
		cost = cost + 3.00;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("g"))
	    {
		System.out.println ("Small Drink $1.50 added");
		cost = cost + 1.50;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("h"))
	    {
		System.out.println ("Medium Drink $2.50 added");
		cost = cost + 2.50;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("i"))
	    {
		System.out.println ("Large Drink $3.00 added");
		cost = cost + 3.00;
		System.out.println("$" +cost);
	    }
	    if (input.equalsIgnoreCase ("j"))
	    {
		System.out.println ("Cupcake $5.00 added");
		cost = cost + 5.00;
		System.out.println("$" +cost);
	    }
	}
	while (!input.equalsIgnoreCase ("q"))  //Thank you answers: http://answers.yahoo.com/question/index?qid=20080626180714AALaziq
	    ;
	System.out.println ("Total $" + cost);
	BufferedReader in;
	in = new BufferedReader (new InputStreamReader (System.in)); //This tells how much you want to pay and how much will be left after that.
	System.out.print ("How much are you paying? $");
	post = in.readLine ();
	double de;
	de = Double.valueOf (post).doubleValue ();//This converts the string into a number so it can be use for final calculation.
	finals = cost - de;
	System.out.println ("Your Total is now: $" + finals);
	{

	}

    }
}



