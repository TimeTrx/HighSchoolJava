// The "StringMagician" class. Version 4.
import java.io.InputStreamReader;
import java.io.*;

public class StringMagician
{
    public static void main (String[] args) throws IOException
    {

	String Word1, Word2; //Sets Word1 and Word2 as a string variable
	int W, X; //Sets W and X as variables
	BufferedReader in;
	in = new BufferedReader (new InputStreamReader (System.in)); //Tells the program that there is going to be input from the keyboard.
	System.out.println ("Please, enter the first word."); //Message given, asking what is going to be entered on the keyboard.
	Word1 = in.readLine ();
	W = Word1.length (); //First word counter command
	System.out.println ("Word 1 Characters: " + W); /*This will output the # of characters in the first word.*/
	if (W <= 5)
	{
	    System.out.println ("Word 1 6th Letter:  ");
	    System.out.println ("Please, enter the second word.");
	    in = new BufferedReader (new InputStreamReader (System.in));
	    Word2 = in.readLine ();
	    X = Word2.length (); //Second word counter command
	    System.out.println ("Word 2 Characters: " + X); /*This will output the # of characters in the second word.*/
	    System.out.println ("Word 2 6th Letter:  ");
	    System.out.println ("This program will not compare for any words found with less than 5 characters.");
	}
	else
	{
	    char Tea; //Sets a character variable called Tea; taken from: http://www.functionx.com/java/Lesson02.htm#char
	    Tea = Word1.charAt (5); //Counter for the 6th character
	    System.out.println ("Word 1 6th Letter: " + Tea); /*This will output the 6th letter in the first word.*/
	    System.out.println ("Please, enter the second word.");
	    in = new BufferedReader (new InputStreamReader (System.in));
	    Word2 = in.readLine ();
	    X = Word2.length (); //Second word counter command
	    System.out.println ("Word 2 Characters: " + X); /*This will output the # of characters in the second word.*/
	    if (X <= 5)
	    { //Checks for the number of letters in the word
		System.out.println ("Word 2 6th Letter:  ");
		int cma; //Sets cma as variable.
		cma = Word1.compareToIgnoreCase (Word2); /*This is the comparison counter*/
		System.out.println ("This program will not compare for any words found less than 5 characters."); /*This will output the comparison of the amount letters in the two words entered.*/
	    }
	    else
	    {
		char Tyler; //Sets a character variable called Tyler, taken from: http://www.functionx.com/java/Lesson02.htm#char
		Tyler = Word2.charAt (5);  //Counter for the 6th character
		System.out.println ("Word 2 6th Letter: " + Tyler); /*This will output the 6th letter in the first word.*/
		int cma; //Sets cma as variable.
		cma = Word1.compareToIgnoreCase (Word2); /*This is the comparison counter*/
		System.out.println ("Comparing: " + cma); /*This will output the comparison of the amount letters in the two words entered.*/
	    }
	}
    } // main method
} // StringMagician class
