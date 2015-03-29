import java.io.*;
public class Recursion2
{
    public static String input; //The input variable
    static String reverse = ""; //Final output variable
    public static int index;
    public static void main (String[] args) throws IOException
    {
	System.out.print ("Enter a Name (With less than 9 letters): "); //Outputs a message to enter an name.
	BufferedReader in; //declared a bufferedreader named in
	in = new BufferedReader (new InputStreamReader (System.in)); //asks for input
	input = in.readLine (); //reads the information entered by the user
	index = input.length ();
	outputName (index, input); //Tells to use outputName method
	System.out.println ("Final product: " + reverse); //This will output just the final product
    }


    public static void outputName (int index, String name) throws IOException
    {


	//Will hold the intitial name
	name = "";

	//Index will be our current position in the string
	index = input.length () - 1;
	if (index == 0)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 1)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 2)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 3)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 4)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 5)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 6)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}
	if (index == 7)
	{
	    //Build our new string from the back to the front
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	    reverse = reverse + input.charAt (index);
	    index--;
	    System.out.println (reverse);
	}

    }
}



