// The "Battleship" class.
import java.io.*;
public class Battleship
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader in;
	String input;
	System.out.println ("Welcome, to: Java Battleship");
	System.out.println ();
	System.out.println ();
	System.out.println ("Options:");
	System.out.println ("1. Play New Game");
	System.out.println ("2. Select an Old Saved Game");
	System.out.println ("3. Rules");
	System.out.println ("4. Help");
	System.out.println ();
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();

	if (input.equals ("3"))
	{
	    System.out.println ();
	    System.out.println ("Rules:");
	    System.out.println ("To sink all of your opponent's ships by correctly guessing their location.");
	    System.out.println ("Give each player a board with two grids, one of each type of ship, ");
	    System.out.println ("and a bunch of hit and miss markers. Pen and paper players should note there");
	    System.out.println ("is one length 2 ship, two length 3 ships, one length 4 ship, and one length 5 ship.");
	    System.out.println ("Players take turns firing a shot to attack enemy ships.");
	    System.out.println ("On your turn, call out a letter and a number of a row and column on the grid. The program");
	    System.out.println ("checks that space on their lower grid, and says miss if there are no ships there, or hit if ");
	    System.out.println ("you guessed a space that contained a ship.");
	    System.out.println ("The first player to sink all opposing ships wins.");
	    //Source: http://boardgames.about.com/od/battleship/a/Rules-of-Battleship.htm
	}
	if (input.equals ("4"))
	{
	    System.out.println ("Help:");
	    System.out.println ("Battleship Version 89.XX3");
	    System.out.println ("Thank you for trying this game!");
	    System.out.println ("Help can be found on our website:");
	    System.out.println ("http://www.eaxmpltr.com/support");
	    System.out.println ("Be sure to state the problem and the version.");
	}
	
	if (input.equals("2"))
	{
	System.out.println ("Please Enter a Saved Game Name: ");
	in = new BufferedReader (new InputStreamReader (System.in));
	input = in.readLine ();
	fileInputOutput File = new fileInputOutput(input+".txt", input+".txt");
	File.getInput();
	File.RunProgram();
       
	}
    } // main method
} // Battleship class

